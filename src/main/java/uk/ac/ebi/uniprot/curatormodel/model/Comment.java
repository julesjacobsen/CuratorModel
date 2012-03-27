/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.ebi.uniprot.curatormodel.model;

/**
 *
 * @author Jules Jacobsen <jacobsen@ebi.ac.uk>
 */
public class Comment {
    
    private CommentType type;
    private String comment;

    public Comment(CommentType type, String comment) {
        this.type = type;
        this.comment = comment;
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
    
    
    public String toString(){
        return String.format("CC   -!- %s: %s", type, comment);
    }
    
}
