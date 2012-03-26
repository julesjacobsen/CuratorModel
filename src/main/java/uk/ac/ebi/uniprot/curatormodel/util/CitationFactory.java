/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.ebi.uniprot.curatormodel.util;

import uk.ac.ebi.uniprot.curatormodel.model.Citation;

/**
 *
 * @author Jules Jacobsen <jacobsen@ebi.ac.uk>
 */
public class CitationFactory {

    public static CitationFactory getInstance() {
        return new CitationFactory();
    }

    public Citation buildJournalCitation() {
        return new Citation();
    }
    
    public Citation buildSubmissionCitation() {
        return new Citation();
    }
}
