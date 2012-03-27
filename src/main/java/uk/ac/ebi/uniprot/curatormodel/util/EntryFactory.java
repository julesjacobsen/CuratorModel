/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.ebi.uniprot.curatormodel.util;

import java.util.ArrayList;
import java.util.logging.Logger;
import uk.ac.ebi.uniprot.curatormodel.model.Citation;
import uk.ac.ebi.uniprot.curatormodel.model.Accessions;
import uk.ac.ebi.uniprot.curatormodel.model.AnnotatedCitation;
import uk.ac.ebi.uniprot.curatormodel.model.Annotatable;
import uk.ac.ebi.uniprot.curatormodel.model.AnnotatedEntry;
import uk.ac.ebi.uniprot.curatormodel.xref.interfaces.Xref;

/**
 *
 * @author Jules Jacobsen <jacobsen@ebi.ac.uk>
 */
public class EntryFactory {
    private static Logger logger = Logger.getLogger(EntryFactory.class.getName());
    
    public static Annotatable getEntry(Accessions accessions) {
        logger.info(String.format("retrieving UniProt entry for: %s", accessions.getPrimaryAccession()));
        return new AnnotatedEntry();
    }

    public static AnnotatedCitation makeAnnotatedCitation(Citation citation) {
        AnnotatedCitation citationEntry = new AnnotatedCitation(citation);
        citationEntry.setXrefs(new ArrayList<Xref>());
//        logger.info(String.format("Made new Annotatable Citation for: %s%n%s", citation.getTitle(), citationEntry));
        
        return citationEntry;
    }
    
}
