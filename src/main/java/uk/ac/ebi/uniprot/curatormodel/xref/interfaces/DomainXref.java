/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.ebi.uniprot.curatormodel.xref.interfaces;

/**
 *
 * @author Jules Jacobsen <jacobsen@ebi.ac.uk>
 */
public interface DomainXref extends Xref {
    
    String getEntryName();
    
    void setEntryName(String entryName);
    
    String getMatchStatus();
    
    void setMatchStatus(String matchStatus);
}
