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
public class AnnotatedEntry implements Annotatable {
    
    Identifier id;
    Accessions accessions;
    Taxonomy tax;
    List<AnnotatedCitation> annotatedCitations;
    List<Citation> citations;

    //interface variables - these are also generated from the citations in the
    //citation list as some annotations may not be derived from a citation, hence the Annotatable nterface
    private List<Comment> comments;
    private List<Feature> features;
    private GeneNames geneNames;
    private InternalSection internalSection;
    private List<KeyWord> keywords;
    private ProteinNames proteinNames;
    private Sequence sequence;
    private List<Xref> xrefs;
    
    public AnnotatedEntry() {
        id = new Identifier();
        accessions = new Accessions();
        tax = new Taxonomy();
        annotatedCitations = new ArrayList<AnnotatedCitation>();
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
        for (AnnotatedCitation annotatedCitation : annotatedCitations) {
            citations.add(annotatedCitation.getCitation());
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
    
    private int refNumber = 1;
    
    public void addAnnotatedCitation(AnnotatedCitation annotatedCitation) {
        annotatedCitation.setReferenceNumber(refNumber);
        annotatedCitations.add(annotatedCitation);
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
