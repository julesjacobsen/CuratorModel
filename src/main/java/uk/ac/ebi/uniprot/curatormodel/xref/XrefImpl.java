/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.ebi.uniprot.curatormodel.xref;

import uk.ac.ebi.uniprot.curatormodel.xref.interfaces.Xref;

/**
 *
 * @author Jules Jacobsen <jacobsen@ebi.ac.uk>
 */
public class XrefImpl implements Xref {
    
    Database database;
    String id;
    String description;
    String[] tokens;

    XrefImpl(Database database, String id, String description) {
        this.database = database;
        this.id = id;
        this.description = description;
        parseDescription(description);
    }
    
    @Override
    public Database getDatabase() {
        return database;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getDescription() {
        return description;
    }

    
    @Override
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
        parseDescription(description);
    }

    @Override
    public String toString() {
        return String.format("DR   %s; %s; %s.", database.toString(), id, description);
    }

    private void parseDescription(String description) {
        tokens = description.split("; ");
    }

    @Override
    public String[] getDescriptionTokens() {
        return tokens;
    }
        
}
