/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.ebi.uniprot.curatormodel.model;

/**
 * 
 * @author Jules Jacobsen <jacobsen@ebi.ac.uk>
 */
public class EvidenceTag {
    //Simple EV tag - this needs work on to flesh out the types
    
    String curatorTag;
    String prefix;
    String type;
    int number;
    String id;
    String date;

    public EvidenceTag(String curatorTag) {
        this.curatorTag = curatorTag;
    }
    
    
    public String getTag() {
        return String.format("{EC%s}", number);
    }
    
    @Override
    public String toString() {
        //**EV EC2; Literature; JUJ; PubMed=11134927; 17-MAY-2006.
        return String.format("**EV %s%s; %s; %s; %s; %s", prefix, number, type, curatorTag, id, date);
    }
    
    
}
