/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.ebi.uniprot.curatormodel.xref;

import uk.ac.ebi.uniprot.curatormodel.xref.interfaces.GoXref;

/**
 *
 * @author Jules Jacobsen <jacobsen@ebi.ac.uk>
 */
public class GoXrefImpl extends XrefImpl implements GoXref {

    GoXrefImpl(Database database, String id, String description) {
        super(database, id, description);
    }
    
}
