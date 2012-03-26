/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.ebi.uniprot.curatormodel.xref.interfaces;

/**
 *
 * @author Jules Jacobsen <jacobsen@ebi.ac.uk>
 */
public interface EnsemblXref extends Xref {
//DR   Ensembl; ENSBTAT00000008225; ENSBTAP00000008225; ENSBTAG00000006270.   
//DR   EnsemblBacteria; EBSTAT00000032812; EBSTAP00000031682; EBSTAG00000032810.
//DR   EnsemblFungi; YDR365W-B; YDR365W-B; YDR365W-B.
//DR   EnsemblMetazoa; FBtr0071603; FBpp0071529; FBgn0020306.
//DR   EnsemblPlants; AT1G66340.1; AT1G66340.1; AT1G66340.
//DR   EnsemblProtists; DDB0305146; DDB0305146; DDB_G0286833.
    public String getTranscriptId();
    
    public void setTranscriptId(String transcriptId);
    
    public String getProteinId();

    public void setProteinId(String proteinId);
   
    public String getGeneId();
    
    public void setGeneId(String geneId);
}
