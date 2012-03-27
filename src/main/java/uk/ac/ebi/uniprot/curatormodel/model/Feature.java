/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.ebi.uniprot.curatormodel.model;

/**
 *
 * @author Jules Jacobsen <jacobsen@ebi.ac.uk>
 */
public class Feature {
    
    private FeatureKey key;
    private int start;
    private int end;
    private String comment;

    public Feature(FeatureKey featureKey, int start, int end, String comment) {
        this.key = featureKey;
        this.start = start;
        this.end = end;
        this.comment = comment;
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
    
    public String toString(){
        return String.format("FT   %-11s%4s%7s       %s",
                this.key, 
                this.start, this.end, 
                this.comment
//                ,this.evTags.toString()
                );
    }
    
}
