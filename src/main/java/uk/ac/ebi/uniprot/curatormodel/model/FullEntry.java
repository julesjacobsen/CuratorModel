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
public class FullEntry extends AbstractEntry {
    
    Identifier id;
    Accessions accessions;
    Taxonomy tax;
    List<CitationEntry> citationEntries;
    List<Citation> citations;

    public FullEntry() {
        super();
        id = new Identifier();
        accessions = new Accessions();
        tax = new Taxonomy();
        citationEntries = new ArrayList<CitationEntry>();
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
        for (CitationEntry citationEntry : citationEntries) {
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
    
    
    
    
    
}
