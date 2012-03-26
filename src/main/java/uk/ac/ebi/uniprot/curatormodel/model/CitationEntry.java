/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.ebi.uniprot.curatormodel.model;

import java.util.ArrayList;
import java.util.List;
import uk.ac.ebi.uniprot.curatormodel.model.Citation;
import uk.ac.ebi.uniprot.curatormodel.xref.interfaces.Xref;


/**
 *
 * @author Jules Jacobsen <jacobsen@ebi.ac.uk>
 */
public class CitationEntry extends AbstractEntry {

    private Citation citation;
            
    public CitationEntry(Citation citation) {
        this.citation = citation;
    }

    public List<Citation> getCitations() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setCitations(List<Citation> citations) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    
}
