/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.ebi.uniprot.curatormodel.model;

/**
 *
 * @author Jules Jacobsen <jacobsen@ebi.ac.uk>
 */
public class Citation {
    
    private int refNumber;
    private String pmid;
    private String rpLine;
    private String title;
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPmid() {
        return pmid;
    }

    public void setPmid(String pmid) {
        this.pmid = pmid;
    }

    public int getRefNumber() {
        return refNumber;
    }

    public void setRefNumber(int refNumber) {
        this.refNumber = refNumber;
    }

    public String getRpLine() {
        return rpLine;
    }

    public void setRpLine(String rpLine) {
        this.rpLine = rpLine;
    }

    
    @Override
    public String toString() {
        return String.format("RN   [%d]%nPR   %s%nRX   PubMed=%s;%nRT   \"%s\"", refNumber, rpLine, pmid,title);
    }
    
    
}
