/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.ebi.uniprot.curatormodel.xref;

import uk.ac.ebi.uniprot.curatormodel.xref.interfaces.EnsemblXref;

/**
 *
 * @author Jules Jacobsen <jacobsen@ebi.ac.uk>
 */
public class EnsemblXrefImpl extends XrefImpl implements EnsemblXref {

    private String transcriptId;
    private String geneId;
    private String proteinId;
    
    EnsemblXrefImpl(Database database, String id, String description) {
        super(database, id, description);
        this.transcriptId = id;
        parseDescription(description);
        //System.out.println("Made new " + database + " xref: " + id);
    }

    @Override
    public String getTranscriptId() {
        return transcriptId;
    }

    @Override
    public void setTranscriptId(String transcriptId) {
        this.transcriptId = transcriptId;
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
    public String getGeneId() {
        return geneId;
    }

    @Override
    public void setGeneId(String geneId) {
        this.geneId = geneId;
    }

    private void parseDescription(String description) {
//        System.out.println("parsing EMBL description");
        String[] fields = description.split("; ");
       
        proteinId = fields[0];
        geneId = fields[1];
//        System.out.println("'" + status + "'");
//        System.out.println("'" + molType + "'");
    }
    
}
