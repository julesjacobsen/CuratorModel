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
public class FullEntry implements Entry {
    
    Identifier id;
    Accessions accessions;
    Taxonomy tax;
    List<CuratedCitation> citationEntries;
    List<Citation> citations;
    
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
    
    public FullEntry() {
        super();
        id = new Identifier();
        accessions = new Accessions();
        tax = new Taxonomy();
        citationEntries = new ArrayList<CuratedCitation>();
        citations = new ArrayList<Citation>();
        
    }
    
    //

    public Accessions getAccessions() {
        return accessions;
    }

    public void setAccessions(Accessions accessions) {
        this.accessions = accessions;
    }

    public List<Citation> getCitations() {
        for (CuratedCitation citationEntry : citationEntries) {
            citations.addAll(citationEntry.getCitations());
        }
        return citations;
    }

    public void setCitations(List<Citation> citations) {
        this.citations = citations;
    }

    public Identifier getId() {
        return id;
    }

    public void setId(Identifier id) {
        this.id = id;
    }

    public Taxonomy getTax() {
        return tax;
    }

    public void setTax(Taxonomy tax) {
        this.tax = tax;
    }
    
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
