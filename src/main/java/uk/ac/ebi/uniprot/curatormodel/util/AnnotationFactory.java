/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.ebi.uniprot.curatormodel.util;

import java.util.*;
import java.util.logging.Logger;
import uk.ac.ebi.uniprot.curatormodel.model.*;
import uk.ac.ebi.uniprot.curatormodel.xref.Database;
import uk.ac.ebi.uniprot.curatormodel.xref.interfaces.EmblXref;
import uk.ac.ebi.uniprot.curatormodel.xref.interfaces.Xref;

/**
 * This is the main class used for Creating/Updating/Deleting annotations from the
 * AnnotatedEntry and AnnotatedCitation classes. Direct access to the classes is
 * not recommended as there are dependencies between bits of data which simple 
 * getters/setters cannot easily handle. 
 * @author Jules Jacobsen <jacobsen@ebi.ac.uk>
 */
public class AnnotationFactory {
    private static Logger logger = Logger.getLogger(AnnotationFactory.class.getName());
    
    public static AnnotatedEntry getEntry(Accessions accessions) {
        logger.info(String.format("retrieving UniProt entry for: %s", accessions.getPrimaryAccession()));

        return new AnnotatedEntry();
    }

    public static AnnotatedCitation buildAnnotatedCitation(Citation citation, EvidenceTag evTag) {
        List<EvidenceTag> evTags = new ArrayList<EvidenceTag>();
        evTag.setPrefix("EC");
        evTag.setType("Experimental");
        evTag.setId("PubMed=" + citation.getPmid());
        evTag.setNumber(1);
//        evTags.add(evTag);
        
        AnnotatedCitation annotatedCitation = new AnnotatedCitation(citation, evTag);

        annotatedCitation.setXrefs(new ArrayList<Xref>());
//        logger.info(String.format("Made new Annotatable Citation for: %s%n%s", citation.getTitle(), citationEntry));
        
        return annotatedCitation;
    }

    public static void addComment(AnnotatedCitation annotatedCitation, Comment comment) {
        List<Comment> comments = annotatedCitation.getComments();
        if (comments == null) {
            comments = new ArrayList<Comment>();
            comments.add(comment);
            annotatedCitation.setComments(comments);
        }
        else {
            comments.add(comment);
        }
        //update the citation with the RP line from this comment
        updateCitationSummary(annotatedCitation);
    }
    
    public static void addXref(AnnotatedCitation annotatedCitation, Xref xref) {
        List<Xref> xrefs = annotatedCitation.getXrefs();
        if (xrefs == null) {
            xrefs = new ArrayList<Xref>();
            xrefs.add(xref);
            annotatedCitation.setXrefs(xrefs);
        }
        else {
            xrefs.add(xref);
        }
    }

    public static void addFeature(AnnotatedCitation annotatedCitation, Feature feature) {
        List<Feature> features = annotatedCitation.getFeatures();
        if (features == null) {
            features = new ArrayList<Feature>();
            features.add(feature);
            annotatedCitation.setFeatures(features);
        }
        else {
            features.add(feature);
        }
        //update the citation with the RP line from this comment
        updateCitationSummary(annotatedCitation);
    }
    
    public static void addAnnotatedCitation(AnnotatedEntry annotatedEntry, AnnotatedCitation annotatedCitation) {
//        logger.info("Adding new AnnotatedCitation: " + annotatedCitation);
        List<AnnotatedCitation> annotatedCitations = annotatedEntry.getAnnotatedCitations();
        //keep a track of the reference additions 
        int number = annotatedCitations.size() + 1;
        annotatedCitation.setReferenceNumber(number);
        annotatedCitation.getCuratorEvidence().setNumber(number);
        annotatedCitation.getCitation().setRefNumber(number);
        
        annotatedEntry.getAnnotatedCitations().add(annotatedCitation);
    }

    private static void updateCitationSummary(AnnotatedCitation annotatedCitation) {
        StringBuilder citationSummary = new StringBuilder();

        List<Xref> xrefs = annotatedCitation.getXrefs();
        if (xrefs != null) {
            for (Xref xref : xrefs) {
                if (xref.getDatabase() == Database.EMBL) {
                    EmblXref emblXref = (EmblXref) xref;
                    citationSummary.append("NUCLEOTIDE SEQUENCE ").append(emblXref.getMoleculeType().toString()).append("; ");
                    //only want one of these
                    continue;
                }
            }   
        }
        
        List<Comment> comments = annotatedCitation.getComments();
        if (comments != null) {
            StringBuilder commentBuilder = new StringBuilder();
            for (Comment comment : comments) {
                commentBuilder.append(comment.getType()).append("; ");
            }
            citationSummary.append(commentBuilder);
        }
        
        Set<FeatureKey> positionalAnnotations = EnumSet.of(FeatureKey.LIPID, FeatureKey.CARBOHYD, FeatureKey.MOD_RES, FeatureKey.MUTAGEN, FeatureKey.VARIANT);
        
        List<Feature> features = annotatedCitation.getFeatures();
        if (features != null) {
            StringBuilder featureBuilder = new StringBuilder();
            for (Feature feature : features) {
                if (positionalAnnotations.contains(feature.getKey())) {
                    featureBuilder.append(feature.getKey()).append(String.format(" AT %d; ", feature.getStart()));
                } else {
                    featureBuilder.append(feature.getKey()).append("; ");
                }
            }
            citationSummary.append(featureBuilder);
        }
        
        annotatedCitation.getCitation().setRpLine(citationSummary.toString().trim());
    }
    
}
