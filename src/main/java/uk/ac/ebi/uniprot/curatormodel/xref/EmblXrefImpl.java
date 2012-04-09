/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.ebi.uniprot.curatormodel.xref;

import uk.ac.ebi.uniprot.curatormodel.xref.embl.EmblMoleculeType;
import uk.ac.ebi.uniprot.curatormodel.xref.embl.EmblStatus;
import uk.ac.ebi.uniprot.curatormodel.xref.interfaces.EmblXref;

/**
 *
 * @author Jules Jacobsen <jacobsen@ebi.ac.uk>
 */
public class EmblXrefImpl extends XrefImpl implements EmblXref {

    private String proteinId;
    private EmblStatus status;
    private EmblMoleculeType molType;

    EmblXrefImpl(Database database, String id, String description) {
        super(database, id, description);
        setDescription(description);
    }

    @Override
    public EmblStatus getStatus() {
        return status;
    }

    @Override
    public void setStatus(EmblStatus status) {
        this.status = status;
    }

    @Override
    public String getProteinId() {
        return proteinId;
    }

    @Override
    public void setProteinId(String proteinId) {
        this.proteinId = proteinId;
    }

    @Override
    public void setDescription(String description) {
        super.setDescription(description);
        proteinId = tokens[0];
        status = EmblStatus.valueOfIgnoreCase(tokens[1]);
//        System.out.println("'" + status + "'");
        molType = EmblMoleculeType.valueOf(tokens[2]);
    }

    @Override
    public EmblMoleculeType getMoleculeType() {
        return molType;
    }

    @Override
    public void setMoleculeType(EmblMoleculeType moleculeType) {
        this.molType = moleculeType;
    }

//    private void parseDescription(String description) {
////        System.out.println("parsing EMBL description");
//        tokens = description.split("; ");
//        
//        
////        System.out.println("'" + proteinId + "'");
//        
////        System.out.println("'" + molType + "'");
//    }
    @Override
    public String[] getDescriptionTokens() {
        return tokens;
    }
}
