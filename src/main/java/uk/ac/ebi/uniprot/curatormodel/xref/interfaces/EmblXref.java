/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.ebi.uniprot.curatormodel.xref.interfaces;

import uk.ac.ebi.uniprot.curatormodel.xref.embl.EmblMoleculeType;
import uk.ac.ebi.uniprot.curatormodel.xref.embl.EmblStatus;

/**
 *
 * @author Jules Jacobsen <jacobsen@ebi.ac.uk>
 */
public interface EmblXref extends Xref {

    
    public EmblStatus getStatus();
    
    public void setStatus(EmblStatus status);

    public String getProteinId();
    
    public void setProteinId(String proteinId);
    
    public EmblMoleculeType getMoleculeType();
    
    public void setMoleculeType(EmblMoleculeType moleculeType);
}
