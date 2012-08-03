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
public class Comment implements EvidenceTagged {

    private CommentType type;
    private String comment;
    private List<EvidenceTag> evTags;

    public Comment(CommentType type, String comment) {
        this.type = type;
        this.comment = comment;
        this.evTags = new ArrayList<EvidenceTag>();
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public CommentType getType() {
        return type;
    }

    public void setType(CommentType type) {
        this.type = type;
    }

    public List<EvidenceTag> getEvidenceTags() {
        return evTags;
    }

    public void setEvidenceTags(List<EvidenceTag> evidenceTags) {
        evTags = evidenceTags;
    }

    @Override
    public String toString() {
        if (!evTags.isEmpty()) {
            //want to get {EC1,EC2,EI4}
            StringBuilder evTagString = new StringBuilder("{");
            for (int i = 0; i < evTags.size(); i++) {
                if (i == evTags.size() - 1) {
                    evTagString.append(evTags.get(i).getTag());                    
                } else {
                    evTagString.append(evTags.get(i).getTag()).append(",");
                }
            }
               
            evTagString.append("}");
            return String.format("CC   -!- %s: %s%s", type, comment, evTagString);
        } else {
            return String.format("CC   -!- %s: %s", type, comment);

        }

    }
}
