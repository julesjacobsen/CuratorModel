/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.ebi.uniprot.curatormodel.xref.interfaces;

import uk.ac.ebi.uniprot.curatormodel.xref.Database;

/**
 *
 * @author Jules Jacobsen <jacobsen@ebi.ac.uk>
 */
public interface Xref {
    
    Database getDatabase();
        
    String getId();
    
    void setId(String id);
    
    String getDescription();
    
    void setDescription(String description);
    
    String[] getDescriptionTokens();
}
