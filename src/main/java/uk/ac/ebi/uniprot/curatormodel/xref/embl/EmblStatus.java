/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.ebi.uniprot.curatormodel.xref.embl;

/**
 *
 * @author Jules Jacobsen <jacobsen@ebi.ac.uk>
 */
public enum EmblStatus {
    NORMAL("-"),
    ALT_INIT("ALT_INIT"),
    ALT_TERM("ALT_TERM"),
    ALT_FRAME("ALT_FRAME"),
    ALT_SEQ("ALT_SEQ"),
    NOT_ANNOTATED_CDS("NOT_ANNOTATED_CDS"),
    JOINED("JOINED");
    
    private String status;
    
    private EmblStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return status;
    }
    
    public static EmblStatus valueOfIgnoreCase(String string) {
        for (EmblStatus emblStatus : EmblStatus.values()) {
            if (string.equals(emblStatus.status)) {
                return emblStatus;
            }
        }
        return NORMAL;
    }
    
}
