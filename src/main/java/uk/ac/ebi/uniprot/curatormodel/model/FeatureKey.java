/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.ebi.uniprot.curatormodel.model;

/**
 *
 * @author Jules Jacobsen <jacobsen@ebi.ac.uk>
 */
public enum FeatureKey {
    //TODO: add the other types here too...
    INIT_MET("nucleotide phosphate-binding region", FeatureKeyType.POSITION),
    SIGNAL("nucleotide phosphate-binding region", FeatureKeyType.REGION),
    PROPEP("nucleotide phosphate-binding region", FeatureKeyType.REGION),
    TRANSIT("nucleotide phosphate-binding region", FeatureKeyType.REGION),
    CHAIN("nucleotide phosphate-binding region", FeatureKeyType.REGION),
    PEPTIDE("nucleotide phosphate-binding region", FeatureKeyType.REGION),
    TOPO_DOM("nucleotide phosphate-binding region", FeatureKeyType.REGION),
    TRANSMEM("nucleotide phosphate-binding region", FeatureKeyType.REGION),
    DOMAIN("nucleotide phosphate-binding region", FeatureKeyType.REGION),
    REPEAT("nucleotide phosphate-binding region", FeatureKeyType.REGION),
    CA_BIND("nucleotide phosphate-binding region", FeatureKeyType.REGION),
    ZN_FING("nucleotide phosphate-binding region", FeatureKeyType.REGION),
    DNA_BIND("nucleotide phosphate-binding region", FeatureKeyType.REGION),
    NP_BIND("nucleotide phosphate-binding region", FeatureKeyType.REGION),
    REGION("region of interest", FeatureKeyType.REGION),
    COILED("nucleotide phosphate-binding region", FeatureKeyType.REGION),
    MOTIF("nucleotide phosphate-binding region", FeatureKeyType.REGION),
    COMPBIAS("nucleotide phosphate-binding region", FeatureKeyType.REGION),
    ACT_SITE("active site", FeatureKeyType.POSITION),
    METAL("metal ion-binding site", FeatureKeyType.POSITION),
    BINDING("binding site", FeatureKeyType.POSITION),
    SITE("site", FeatureKeyType.POSITION),
    NON_STD("non-standard amino acid", FeatureKeyType.POSITION),
    MOD_RES("modified residue", FeatureKeyType.POSITION),
    LIPID("lipid moiety-binding region", FeatureKeyType.POSITION),
    CARBOHYD("glycosylation site", FeatureKeyType.POSITION),
    DISULFID("disulfide bond", FeatureKeyType.MULTI_POSITION),
    CROSSLNK("cross-link", FeatureKeyType.MULTI_POSITION),
    VAR_SEQ("nucleotide phosphate-binding region", FeatureKeyType.REGION),
    VARIANT("nucleotide phosphate-binding region", FeatureKeyType.MULTI_POSITION),
    MUTAGEN("nucleotide phosphate-binding region", FeatureKeyType.REGION),
    UNSURE("nucleotide phosphate-binding region", FeatureKeyType.REGION),
    CONFLICT("nucleotide phosphate-binding region", FeatureKeyType.REGION),
    NON_CONS("nucleotide phosphate-binding region", FeatureKeyType.REGION),
    NON_TER("nucleotide phosphate-binding region", FeatureKeyType.POSITION),
    HELIX("nucleotide phosphate-binding region", FeatureKeyType.REGION),
    STRAND("nucleotide phosphate-binding region", FeatureKeyType.REGION),
    TURN("nucleotide phosphate-binding region", FeatureKeyType.REGION);

    private final String XMLstring;
    private final FeatureKeyType type;
    
    FeatureKey(String XMLstring, FeatureKeyType type) {
        this.XMLstring = XMLstring;
        this.type = type;
    }
    
    public String toXMLString() {
        return XMLstring;
    }   
    
    public FeatureKeyType getType() {
        return type;
    }
}
