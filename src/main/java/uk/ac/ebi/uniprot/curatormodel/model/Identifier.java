/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.ebi.uniprot.curatormodel.model;

/**
 *
 * @author Jules Jacobsen <jacobsen@ebi.ac.uk>
 */
public class Identifier {
    
    String nameMnemonic;
    String taxMnemonic;

    public Identifier() {
    }

    public Identifier(String nameMnemonic, String taxMnemonic) {
        this.nameMnemonic = nameMnemonic;
        this.taxMnemonic = taxMnemonic;
    }

    public String getNameMnemonic() {
        return nameMnemonic;
    }

    public void setNameMnemonic(String nameMnemonic) {
        this.nameMnemonic = nameMnemonic;
    }

    public String getTaxMnemonic() {
        return taxMnemonic;
    }

    public void setTaxMnemonic(String taxMnemonic) {
        this.taxMnemonic = taxMnemonic;
    }
    
    
    @Override
    public String toString() {
        return String.format("ID   %s_%s", nameMnemonic, taxMnemonic);
    }
    
}
