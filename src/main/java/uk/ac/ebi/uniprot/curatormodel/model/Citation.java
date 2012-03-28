/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.ebi.uniprot.curatormodel.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jules Jacobsen <jacobsen@ebi.ac.uk>
 */
public class Citation implements EvidenceTagged {

    private int refNumber;
    private String pmid;
    private String rpLine;
    private String title;
    private List<EvidenceTag> evidenceTags;

    public Citation() {
        this.evidenceTags = new ArrayList<EvidenceTag>();
    }

    
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

    public List<EvidenceTag> getEvidenceTags() {
        return evidenceTags;
    }

    public void setEvidenceTags(List<EvidenceTag> evidenceTags) {
        this.evidenceTags = evidenceTags;
    }

    @Override
    public String toString() {
        if (!evidenceTags.isEmpty()) {
            //want to get {EC1,EC2,EI4}
            StringBuilder evTagString = new StringBuilder("{");
            for (int i = 0; i < evidenceTags.size(); i++) {
                if (i == evidenceTags.size() - 1) {
                    evTagString.append(evidenceTags.get(i).getTag());
                } else {
                    evTagString.append(evidenceTags.get(i).getTag()).append(",");
                }
            }

            evTagString.append("}");
            return String.format("RN   [%d]%s%nPR   %s%nRX   PubMed=%s;%nRT   \"%s\"", refNumber, evTagString, rpLine, pmid, title);
        } else {
            return String.format("RN   [%d]%nPR   %s%nRX   PubMed=%s;%nRT   \"%s\"", refNumber, rpLine, pmid, title);
        }
    }
}
