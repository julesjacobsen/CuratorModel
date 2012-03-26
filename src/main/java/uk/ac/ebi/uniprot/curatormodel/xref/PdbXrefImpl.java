/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.ebi.uniprot.curatormodel.xref;

import uk.ac.ebi.uniprot.curatormodel.xref.interfaces.PdbXref;

/**
 *
 * @author Jules Jacobsen <jacobsen@ebi.ac.uk>
 */
class PdbXrefImpl extends XrefImpl implements PdbXref {

    PdbXrefImpl(Database database, String id, String description) {
        super(database, id, description);
    }

}
