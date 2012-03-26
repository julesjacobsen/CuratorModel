/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.ebi.uniprot.curatormodel.xref.embl;

/**
 *
 * @author Jules Jacobsen <jacobsen@ebi.ac.uk>
 */
public enum EmblMoleculeType {
    mRNA("mRNA"),
    Genomic_DNA("Genomic_DNA"),
    Genomic_RNA("Genomic_RNA"),
    Transcribed_RNA("Transcribed_RNA"), 
    Viral_cRNA("Viral_cRNA"),
    Unassigned_DNA("Unassigned_DNA"),
    Unassigned_RNA("Unassigned_RNA"),
    Other_DNA("Other_DNA"), 
    Other_RNA("Other_RNA"),
    UNKNOWN("-");
    
    String molType;
    
    private EmblMoleculeType(String molType) {
        this.molType = molType;
    }

    @Override
    public String toString() {
        return molType;
    }
    
    
}
