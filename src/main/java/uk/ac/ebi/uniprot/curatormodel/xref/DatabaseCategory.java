/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.ebi.uniprot.curatormodel.xref;

/**
 * Describes the knowledge domain of the database.
 * <link>http://master.expasy.org/spdocvar/userman-internal.htm#DR_line</>
 * @author Jules Jacobsen <jacobsen@ebi.ac.uk>
 */
public enum DatabaseCategory {
    SEQUENCE(),
    STRUCTURE(),
    PROTEIN_GROUP(),
    PTM(),
    TWO_DEE_GEL(),
    PROTEOMIC(),
    ORGANISM(),
    DOMAIN_FAMILY(),
    PROT_PROT_INTERACTION(),
    ONTOLOGY(),
    PATHWAY(),
    GENOME_ANNOTATION(),
    GENE_EXPRESSION(),
    PHYLOGENETIC(),
    DRUG_INTERACTION(),
    OTHER(); 
}
