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

    public String getCuratorTag() {
        return curatorTag;
    }

    public void setCuratorTag(String curatorTag) {
        this.curatorTag = curatorTag;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
