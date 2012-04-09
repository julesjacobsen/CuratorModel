/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.ebi.uniprot.curatormodel.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jules Jacobsen <jacobsen@ebi.ac.uk>
 */
public class Accessions {
    String primaryAccession;
    List<String> secondaryAccessions;

    public Accessions() {
    }
    
    public Accessions(String primaryAccession) {
        this.primaryAccession = primaryAccession;
    }

    public Accessions(String primaryAccession, List<String> secondaryAccessions) {
        this.primaryAccession = primaryAccession;
        this.secondaryAccessions = secondaryAccessions;
    }

    public String getPrimaryAccession() {
        return primaryAccession;
    }

    public void setPrimaryAccession(String primaryAccession) {
        this.primaryAccession = primaryAccession;
    }

    public List<String> getSecondaryAccessions() {
        if (secondaryAccessions == null) {
            secondaryAccessions = new ArrayList<String>();
        }
        return secondaryAccessions;
    }

    public void setSecondaryAccessions(List<String> secondaryAccessions) {
        this.secondaryAccessions = secondaryAccessions;
    }

    @Override
    public String toString() {
        if (secondaryAccessions == null || secondaryAccessions.isEmpty()) {
            return String.format("AC   %s;", primaryAccession);
        }
        
        StringBuilder secondaryAcBuilder = new StringBuilder();
        for (String accession : secondaryAccessions) {
            secondaryAcBuilder.append(accession).append(";");
        }
        return String.format("AC   %s;%s", primaryAccession, secondaryAcBuilder.toString());
    }
 
    
    
}
