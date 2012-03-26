/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.ebi.uniprot.curatormodel.model;

import java.util.List;
import uk.ac.ebi.uniprot.curatormodel.xref.interfaces.Xref;

/**
 *
 * @author Jules Jacobsen <jacobsen@ebi.ac.uk>
 */
public abstract class AbstractEntry implements Entry {

    //interface variables - these are also generated from the citations in the
    //citation list as some annotations may not be derived from a citation, hence the Entry nterface
    List<Comment> comments;
    List<Feature> features;
    GeneNames geneNames;
    InternalSection internalSection;
    List<KeyWord> keywords;
    ProteinNames proteinNames;
    Sequence sequence;
    List<Xref> xrefs;
    
    //interface implementations
    @Override
    public List<Comment> getComments() {
        return comments;
    }

    @Override
    public List<Feature> getFeatures() {
        return features;
    }

    @Override
    public GeneNames getGeneNames() {
        return geneNames;
    }

    @Override
    public InternalSection getInternalSection() {
        return internalSection;
    }

    @Override
    public List<KeyWord> getKeywords() {
        return keywords;
    }

    @Override
    public ProteinNames getProteinNames() {
        return proteinNames;
    }

    @Override
    public Sequence getSequence() {
        return sequence;
    }

    @Override
    public List<Xref> getXrefs() {
        return xrefs;
    }

    @Override
    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    @Override
    public void setFeatures(List<Feature> features) {
        this.features = features;
    }

    @Override
    public void setGeneNames(GeneNames geneNames) {
        this.geneNames = geneNames;
    }

    @Override
    public void setInternalSection(InternalSection internalSection) {
        this.internalSection = internalSection;
    }

    @Override
    public void setKeywords(List<KeyWord> keywords) {
        this.keywords = keywords;
    }

    @Override
    public void setProteinNames(ProteinNames proteinNames) {
        this.proteinNames = proteinNames;
    }

    @Override
    public void setSequence(Sequence sequence) {
        this.sequence = sequence;
    }

    @Override
    public void setXrefs(List<Xref> xrefs) {
        this.xrefs = xrefs;
    }
    
    
}
