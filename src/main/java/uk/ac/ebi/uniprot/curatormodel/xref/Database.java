
package uk.ac.ebi.uniprot.curatormodel.xref;

/**
 *
 * @author Jules Jacobsen <jacobsen@ebi.ac.uk>
 */
public enum Database {

    EMBL("EMBL", DatabaseCategory.SEQUENCE),
    IPI("IPI", DatabaseCategory.PROTEOMIC),
    PIR("PIR", DatabaseCategory.SEQUENCE),
    RefSeq("RefSeq", DatabaseCategory.SEQUENCE),
    UniGene("UniGene", DatabaseCategory.SEQUENCE),
    PDB("PDB", DatabaseCategory.STRUCTURE),
    PDBsum("PDBsum", DatabaseCategory.STRUCTURE),
    HSSP("HSSP", DatabaseCategory.STRUCTURE),
    ProteinModelPortal("ProteinModelPortal", DatabaseCategory.STRUCTURE),
    SMR("SMR", DatabaseCategory.STRUCTURE),
    DisProt("DisProt", DatabaseCategory.STRUCTURE),
    DIP("DIP", DatabaseCategory.PROT_PROT_INTERACTION),
    IntAct("IntAct", DatabaseCategory.PROT_PROT_INTERACTION),
    MINT("MINT", DatabaseCategory.PROT_PROT_INTERACTION),
    STRING("STRING", DatabaseCategory.PROT_PROT_INTERACTION),
    Allergome("Allergome", DatabaseCategory.PROTEIN_GROUP),
    CAZy("CAZy", DatabaseCategory.PROTEIN_GROUP),
    MEROPS("MEROPS", DatabaseCategory.PROTEIN_GROUP),
    PeroxiBase("PeroxiBase", DatabaseCategory.PROTEIN_GROUP),
    PptaseDB("PptaseDB", DatabaseCategory.PROTEIN_GROUP),
    REBASE("REBASE", DatabaseCategory.PROTEIN_GROUP),
    TCDB("TCDB", DatabaseCategory.PROTEIN_GROUP),
    GlycoSuiteDB("GlycoSuiteDB", DatabaseCategory.PTM),
    PhosphoSite("PhosphoSite", DatabaseCategory.PTM),
    PhosSite("PhosSite", DatabaseCategory.PTM),
    SWISS_PAGE("SWISS-2DPAGE", DatabaseCategory.TWO_DEE_GEL),
    twoDeeBase_Ecoli("2DBase-Ecoli", DatabaseCategory.TWO_DEE_GEL),
    Aarhus_Ghent_PAGE("Aarhus/Ghent-2DPAGE", DatabaseCategory.TWO_DEE_GEL),
    ANU_PAGE("ANU-2DPAGE", DatabaseCategory.TWO_DEE_GEL),
    COMPLUYEAST_PAGE("COMPLUYEAST-2DPAGE", DatabaseCategory.TWO_DEE_GEL),
    Cornea_PAGE("Cornea-2DPAGE", DatabaseCategory.TWO_DEE_GEL),
    DOSAC_COBS_PAGE("DOSAC-COBS-2DPAGE", DatabaseCategory.TWO_DEE_GEL),
    ECO2DBASE("ECO2DBASE", DatabaseCategory.TWO_DEE_GEL),
    OGP("OGP", DatabaseCategory.TWO_DEE_GEL),
    PHCI_PAGE("PHCI-2DPAGE", DatabaseCategory.TWO_DEE_GEL),
    PMMA_PAGE("PMMA-2DPAGE", DatabaseCategory.TWO_DEE_GEL),
    Rat_heart_PAGE("Rat-heart-2DPAGE", DatabaseCategory.TWO_DEE_GEL),
    REPRODUCTION_PAGE("REPRODUCTION-2DPAGE", DatabaseCategory.TWO_DEE_GEL),
    Siena_PAGE("Siena-2DPAGE", DatabaseCategory.TWO_DEE_GEL),
    UCD_PAGE("UCD-2DPAGE", DatabaseCategory.TWO_DEE_GEL),
    World_PAGE("World-2DPAGE", DatabaseCategory.TWO_DEE_GEL),
    PeptideAtlas("PeptideAtlas", DatabaseCategory.PROTEOMIC),
    PRIDE("PRIDE", DatabaseCategory.PROTEOMIC),
    ProMEX("ProMEX", DatabaseCategory.PROTEOMIC),
    Ensembl("Ensembl", DatabaseCategory.GENOME_ANNOTATION),
    EnsemblBacteria("EnsemblBacteria", DatabaseCategory.GENOME_ANNOTATION),
    EnsemblFungi("EnsemblFungi", DatabaseCategory.GENOME_ANNOTATION),
    EnsemblMetazoa("EnsemblMetazoa", DatabaseCategory.GENOME_ANNOTATION),
    EnsemblPlants("EnsemblPlants", DatabaseCategory.GENOME_ANNOTATION),
    EnsemblProtists("EnsemblProtists", DatabaseCategory.GENOME_ANNOTATION),
    GeneID("GeneID", DatabaseCategory.SEQUENCE),
    GenomeReviews("GenomeReviews", DatabaseCategory.GENOME_ANNOTATION),
    KEGG("KEGG", DatabaseCategory.GENOME_ANNOTATION),
    NMPDR("NMPDR", DatabaseCategory.GENOME_ANNOTATION),
    TIGR("TIGR", DatabaseCategory.GENOME_ANNOTATION),
    UCSC("UCSC", DatabaseCategory.GENOME_ANNOTATION),
    VectorBase("VectorBase", DatabaseCategory.GENOME_ANNOTATION),
    AGD("AGD", DatabaseCategory.ORGANISM),
    ArachnoServer("ArachnoServer", DatabaseCategory.ORGANISM),
    CGD("CGD", DatabaseCategory.ORGANISM),
    ConoServer("ConoServer", DatabaseCategory.ORGANISM),
    CTD("CTD", DatabaseCategory.ORGANISM),
    CYGD("CYGD", DatabaseCategory.ORGANISM),
    dictyBase("dictyBase", DatabaseCategory.ORGANISM),
    EchoBASE("EchoBASE", DatabaseCategory.ORGANISM),
    EcoGene("EcoGene", DatabaseCategory.ORGANISM),
    euHCVdb("euHCVdb", DatabaseCategory.ORGANISM),
    EuPathDB("EuPathDB", DatabaseCategory.ORGANISM),
    FlyBase("FlyBase", DatabaseCategory.ORGANISM),
    GeneCards("GeneCards", DatabaseCategory.ORGANISM),
    GeneDB_Spombe("GeneDB_Spombe", DatabaseCategory.ORGANISM),
    GeneFarm("GeneFarm", DatabaseCategory.ORGANISM),
    GenoList("GenoList", DatabaseCategory.ORGANISM),
    Gramene("Gramene", DatabaseCategory.ORGANISM),
    H_InvDB("H-InvDB", DatabaseCategory.ORGANISM),
    HGNC("HGNC", DatabaseCategory.ORGANISM),
    HPA("HPA", DatabaseCategory.ORGANISM),
    LegioList("LegioList", DatabaseCategory.ORGANISM),
    Leproma("Leproma", DatabaseCategory.ORGANISM),
    MaizeGDB("MaizeGDB", DatabaseCategory.ORGANISM),
    MIM("MIM", DatabaseCategory.ORGANISM),
    MGI("MGI", DatabaseCategory.ORGANISM),
    neXtProt("neXtProt", DatabaseCategory.ORGANISM),
    Orphanet("Orphanet", DatabaseCategory.ORGANISM),
    PharmGKB("PharmGKB", DatabaseCategory.ORGANISM),
    PseudoCAP("PseudoCAP", DatabaseCategory.ORGANISM),
    RGD("RGD", DatabaseCategory.ORGANISM),
    SGD("SGD", DatabaseCategory.ORGANISM),
    TAIR("TAIR", DatabaseCategory.ORGANISM),
    TubercuList("TubercuList", DatabaseCategory.ORGANISM),
    WormBase("WormBase", DatabaseCategory.ORGANISM),
    Xenbase("Xenbase", DatabaseCategory.ORGANISM),
    ZFIN("ZFIN", DatabaseCategory.ORGANISM),
    eggNOG("eggNOG", DatabaseCategory.PHYLOGENETIC),
    GeneTree("GeneTree", DatabaseCategory.PHYLOGENETIC),
    HOGENOM("HOGENOM", DatabaseCategory.PHYLOGENETIC),
    HOVERGEN("HOVERGEN", DatabaseCategory.PHYLOGENETIC),
    InParanoid("InParanoid", DatabaseCategory.PHYLOGENETIC),
    OMA("OMA", DatabaseCategory.PHYLOGENETIC),
    OrthoDB("OrthoDB", DatabaseCategory.PHYLOGENETIC),
    PhylomeDB("PhylomeDB", DatabaseCategory.PHYLOGENETIC),
    ProtClustDB("ProtClustDB", DatabaseCategory.PHYLOGENETIC),
    BioCyc("BioCyc", DatabaseCategory.PATHWAY),
    BRENDA("BRENDA", DatabaseCategory.PATHWAY),
    Pathway_Interaction_DB("Pathway_Interaction_DB", DatabaseCategory.PATHWAY),
    Reactome("Reactome", DatabaseCategory.PATHWAY),
    BindingDB("BindingDB", DatabaseCategory.DRUG_INTERACTION),
    DrugBank("DrugBank", DatabaseCategory.DRUG_INTERACTION),
    NextBio("NextBio", DatabaseCategory.OTHER),
    PMAP_CutDB("PMAP-CutDB", DatabaseCategory.OTHER),
    ArrayExpress("ArrayExpress", DatabaseCategory.GENE_EXPRESSION),
    Bgee("Bgee", DatabaseCategory.GENE_EXPRESSION),
    CleanEx("CleanEx", DatabaseCategory.GENE_EXPRESSION),
    Genevestigator("Genevestigator", DatabaseCategory.GENE_EXPRESSION),
    GermOnline("GermOnline", DatabaseCategory.PROTEIN_GROUP),
    GO("GO", DatabaseCategory.ONTOLOGY),
    HAMAP("HAMAP", DatabaseCategory.DOMAIN_FAMILY),
    InterPro("InterPro", DatabaseCategory.DOMAIN_FAMILY),
    Gene3D("Gene3D", DatabaseCategory.DOMAIN_FAMILY),
    PANTHER("PANTHER", DatabaseCategory.DOMAIN_FAMILY),
    Pfam("Pfam", DatabaseCategory.DOMAIN_FAMILY),
    PIRSF("PIRSF", DatabaseCategory.DOMAIN_FAMILY),
    PRINTS("PRINTS", DatabaseCategory.DOMAIN_FAMILY),
    ProDom("ProDom", DatabaseCategory.DOMAIN_FAMILY),
    SMART("SMART", DatabaseCategory.DOMAIN_FAMILY),
    SUPFAM("SUPFAM", DatabaseCategory.DOMAIN_FAMILY),
    TIGRFAMs("TIGRFAMs", DatabaseCategory.DOMAIN_FAMILY),
    PROSITE("PROSITE", DatabaseCategory.DOMAIN_FAMILY),
    
    NONE("NONE", DatabaseCategory.OTHER);
    
    private String name;
    private DatabaseCategory category;

    private Database(String name, DatabaseCategory category) {
        this.name = name;
        this.category = category;
    }

    @Override
    public String toString() {
        return this.name;
    }
    
    public static Database valueOfIgnoreCase(String string) {
        for (Database database : Database.values()) {
            if (string.equals(database.name)) {
                return database;
            }
        }
        return NONE;
    }

    DatabaseCategory getCategory() {
        return this.category;
    }
}
