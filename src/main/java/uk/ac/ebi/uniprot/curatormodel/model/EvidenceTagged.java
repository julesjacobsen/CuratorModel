/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.ebi.uniprot.curatormodel.model;

import java.util.List;

/**
 * Interface for defining evidenceTag-related activities.
 * @author Jules Jacobsen <jacobsen@ebi.ac.uk>
 */
public interface EvidenceTagged {
    
    public List<EvidenceTag> getEvidenceTags();
    
    public void setEvidenceTags(List<EvidenceTag> evidenceTags);
    
}
