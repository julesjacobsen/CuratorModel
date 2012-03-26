/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.ebi.uniprot.curatormodel.util;

import java.util.logging.Logger;
import uk.ac.ebi.uniprot.curatormodel.model.Citation;
import uk.ac.ebi.uniprot.curatormodel.model.Accessions;
import uk.ac.ebi.uniprot.curatormodel.model.CuratedCitation;
import uk.ac.ebi.uniprot.curatormodel.model.Entry;
import uk.ac.ebi.uniprot.curatormodel.model.FullEntry;

/**
 *
 * @author Jules Jacobsen <jacobsen@ebi.ac.uk>
 */
public class EntryFactory {
    private static Logger logger = Logger.getLogger(EntryFactory.class.getName());
    
    public static Entry getEntry(Accessions accessions) {
        logger.info(String.format("retrieving UniProt entry for: %s", accessions.getPrimaryAccession()));
        return new FullEntry();
    }

    public static Entry makeCitationEntry(Citation citation) {
        logger.info(String.format("Made new CitationEtry for: %s", citation.getTitle()));
        
        
        return new CuratedCitation(citation);
    }
    
}
