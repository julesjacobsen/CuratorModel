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
public class CuratedCitation implements Entry {

    private Citation citation;
            
    public CuratedCitation(Citation citation) {
        this.citation = citation;
    }

    public List<Citation> getCitations() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setCitations(List<Citation> citations) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

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
        throw new UnsupportedOperationException("Not supported yet.");
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
        throw new UnsupportedOperationException("Not supported yet.");
    }

    
}
