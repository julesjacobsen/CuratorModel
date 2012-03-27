/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.ebi.uniprot.curatormodel.model;

import java.util.ArrayList;
import java.util.List;
import uk.ac.ebi.uniprot.curatormodel.model.Citation;
import uk.ac.ebi.uniprot.curatormodel.xref.interfaces.Xref;


/**
 *
 * @author Jules Jacobsen <jacobsen@ebi.ac.uk>
 */
public class AnnotatedCitation implements Annotatable {

    private Citation citation;
    private EvidenceTag evTag;
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
    
    public AnnotatedCitation(Citation citation) {
        this.citation = citation;
        
    }

    //class-specific methods
    public Citation getCitation() {
        return citation;
    }

    public void setCitation(Citation citation) {
        this.citation = citation;
    }

    public EvidenceTag getEvidenceTag() {
        return evTag;
    }
    
    public void setEvidenceTag(EvidenceTag evTag) {
        this.evTag = evTag;
    }

    public int getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(int referenceNumber) {
        this.referenceNumber = referenceNumber;
    }
    
    
    //interface methods
    public List<Comment> getComments() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List<Feature> getFeatures() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public GeneNames getGeneNames() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public InternalSection getInternalSection() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List<KeyWord> getKeywords() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public ProteinNames getProteinNames() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Sequence getSequence() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List<Xref> getXrefs() {
        return xrefs;
    }

    public void setComments(List<Comment> comments) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setFeatures(List<Feature> features) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setGeneNames(GeneNames gn) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setInternalSection(InternalSection internalSection) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setKeywords(List<KeyWord> keywords) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setProteinNames(ProteinNames proteinNames) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setSequence(Sequence sequence) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setXrefs(List<Xref> xrefs) {
        this.xrefs = xrefs;
    }
    
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(citation).append(EOL);
        if (!xrefs.isEmpty()) {
            for (Xref xref : xrefs) {
                stringBuilder.append(xref).append(EOL);
            }
        }
        stringBuilder.append(evTag);
        return stringBuilder.toString();
    }

    
}
