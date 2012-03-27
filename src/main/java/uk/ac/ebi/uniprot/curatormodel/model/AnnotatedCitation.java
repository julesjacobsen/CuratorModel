/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.ebi.uniprot.curatormodel.model;

import java.util.ArrayList;
import java.util.List;
import uk.ac.ebi.uniprot.curatormodel.xref.interfaces.Xref;


/**
 *
 * @author Jules Jacobsen <jacobsen@ebi.ac.uk>
 */
public class AnnotatedCitation implements Annotatable {

    private Citation citation;
    private EvidenceTag curatorEvidence;
    private List<EvidenceTag> evTags;
    private int referenceNumber;
    
    private static final String EOL = System.getProperty("line.separator");
    
    //interface variables 
    private List<Comment> comments;
    private List<Feature> features;
    private GeneNames geneNames;
    private InternalSection internalSection;
    private List<KeyWord> keywords;
    private ProteinNames proteinNames;
    private Sequence sequence;
    private List<Xref> xrefs;

    public AnnotatedCitation() {
    }
    
    public AnnotatedCitation(Citation citation, EvidenceTag curatorEvidence) {
        this.citation = citation;
        this.curatorEvidence = curatorEvidence;    
    }

    //class-specific methods
    public Citation getCitation() {
        return citation;
    }

    public void setCitation(Citation citation) {
        this.citation = citation;
    }

    public EvidenceTag getCuratorEvidence(){
        return curatorEvidence;
    }
    
    public List<EvidenceTag> getEvidenceTags() {
        return evTags;
    }
    
    public void setEvidenceTags(List<EvidenceTag> evTags) {
        this.evTags = evTags;
    }

    public int getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(int referenceNumber) {
        this.referenceNumber = referenceNumber;
    }
    
    
    //interface methods
    public List<Comment> getComments() {
        return comments;
    }

    public List<Feature> getFeatures() {
        return features;
    }

    public GeneNames getGeneNames() {
        return geneNames;
    }

    public InternalSection getInternalSection() {
        return internalSection;
    }

    public List<KeyWord> getKeywords() {
        return keywords;
    }

    public ProteinNames getProteinNames() {
        return proteinNames;
    }

    public Sequence getSequence() {
        return sequence;
    }

    public List<Xref> getXrefs() {
        return xrefs;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public void setFeatures(List<Feature> features) {
        this.features = features;
    }

    public void setGeneNames(GeneNames gn) {
        this.geneNames = geneNames;
    }

    public void setInternalSection(InternalSection internalSection) {
        this.internalSection = internalSection;
    }

    public void setKeywords(List<KeyWord> keywords) {
        this.keywords = keywords;
    }

    public void setProteinNames(ProteinNames proteinNames) {
        this.proteinNames = proteinNames;
    }

    public void setSequence(Sequence sequence) {
        this.sequence = sequence;
    }

    public void setXrefs(List<Xref> xrefs) {
        this.xrefs = xrefs;
    }
    
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(citation).append(EOL);
        if (comments != null ) {
            for (Comment comment : comments) {
                stringBuilder.append(comment).append(EOL);
            }
        }
        if (xrefs != null ) {
            for (Xref xref : xrefs) {
                stringBuilder.append(xref).append(EOL);
            }
        }
        if (sequence != null) {
            stringBuilder.append(sequence).append(EOL);
        }
        
        if (evTags != null) {
            for (EvidenceTag evidenceTag : evTags) {
                stringBuilder.append(evidenceTag).append(EOL);
            }
        }
        stringBuilder.append(curatorEvidence);
        return stringBuilder.toString();
    }

    
}
