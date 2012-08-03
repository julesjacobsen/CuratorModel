/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.ebi.uniprot.curatormodel.xref;

import java.util.EnumSet;
import java.util.logging.Logger;
import uk.ac.ebi.uniprot.curatormodel.xref.interfaces.Xref;

/**
 *
 * @author Jules Jacobsen <jacobsen@ebi.ac.uk>
 */
public class XrefFactory {
    
    private static volatile XrefFactory instance;
    private EnumSet ensembleXrefs;
    private EnumSet interproFamilyXrefs;
    
    private static final Logger logger = Logger.getLogger(XrefFactory.class.getName()); 
    
    private XrefFactory() {
        ensembleXrefs = EnumSet.of(
                Database.Ensembl,
                Database.EnsemblBacteria, 
                Database.EnsemblFungi,
                Database.EnsemblMetazoa,
                Database.EnsemblPlants,
                Database.EnsemblProtists);
        
        //neither InterPro no PRINTS have the fourth column like these guys do
        interproFamilyXrefs = EnumSet.of(
                Database.Gene3D, 
                Database.Pfam, 
                Database.SMART,
                Database.SUPFAM,
                Database.PROSITE);
    }
        
    public static XrefFactory getInstance() {
        if (instance == null) {
            instance = new XrefFactory();
        }
        return instance;
    }

    public Xref buildXref(Database database, String id, String description) {
               
        if (database == Database.EMBL) {
            return new EmblXrefImpl(database, id, description);
        }
        else if (database == Database.PDB) {        
            return new PdbXrefImpl(database, id, description);
        }        
        else if (database == Database.GO) {
            return new GoXrefImpl(database, id, description);
        }
        else if (database == Database.HAMAP) {
            return new HamapXrefImpl(database, id, description);
        }
        else if (ensembleXrefs.contains(database)) {
            return new EnsemblXrefImpl(database, id, description);
        }
        else if (interproFamilyXrefs.contains(database)) {
            return new DomainXrefImpl(database, id, description);
        }
        else {
            return new XrefImpl(database, id, description);
        }
    }
    

}
