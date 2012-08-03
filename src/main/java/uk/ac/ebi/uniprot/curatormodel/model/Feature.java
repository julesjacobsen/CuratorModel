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
public class Feature implements EvidenceTagged {
    
    private FeatureKey key;
    private int start;
    private int end;
    private String comment;
    private List<EvidenceTag> evidenceTags;
    
    public Feature(FeatureKey featureKey, int start, int end, String comment) {
        this.key = featureKey;
        this.start = start;
        this.end = end;
        this.comment = comment;
        this.evidenceTags = new ArrayList<EvidenceTag>();
    }
    
    public FeatureKey getKey() {
        return key;
    }

    public void setKey(FeatureKey key) {
        this.key = key;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public List<EvidenceTag> getEvidenceTags() {
        return evidenceTags;
    }

    public void setEvidenceTags(List<EvidenceTag> evidenceTags) {
        this.evidenceTags = evidenceTags;
    }
      
    @Override
    public String toString(){
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
            return String.format("FT   %-11s%4s%7s       %s%s", this.key, this.start, this.end, this.comment, evTagString);
        } else {
            return String.format("FT   %-11s%4s%7s       %s", this.key, this.start, this.end, this.comment);
        }        
    }
    
}
