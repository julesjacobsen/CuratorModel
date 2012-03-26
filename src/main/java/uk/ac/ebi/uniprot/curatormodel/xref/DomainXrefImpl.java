/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.ebi.uniprot.curatormodel.xref;

import uk.ac.ebi.uniprot.curatormodel.xref.interfaces.DomainXref;

/**
 *
 * @author Jules Jacobsen <jacobsen@ebi.ac.uk>
 */
public class DomainXrefImpl extends XrefImpl implements DomainXref{

    String entryName;
    String matchStatus;
    
    DomainXrefImpl(Database database, String id, String description) {
        super(database, id, description);
        parseDescription(description);
    }

    @Override
    public String getEntryName() {
        return entryName;
    }

    @Override
    public void setEntryName(String entryName) {
        this.entryName = entryName;
    }

    @Override
    public String getMatchStatus() {
        return matchStatus;
    }

    @Override
    public void setMatchStatus(String matchStatus) {
        this.matchStatus = matchStatus;
    }

    private void parseDescription(String description) {
//        System.out.println("parsing EMBL description");
        String[] fields = description.split("; ");
        
        entryName = fields[0];
//        System.out.println("'" + proteinId + "'");
        matchStatus = fields[1];
//        System.out.println("'" + status + "'");
//        System.out.println("'" + molType + "'");
    }
    
}
