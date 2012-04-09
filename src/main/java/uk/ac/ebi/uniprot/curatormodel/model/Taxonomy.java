/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.ebi.uniprot.curatormodel.model;

/**
 *
 * @author Jules Jacobsen <jacobsen@ebi.ac.uk>
 */
class Taxonomy {
    //OS   Corynephage beta.
    //OC   Viruses; dsDNA viruses, no RNA stage; Caudovirales; Siphoviridae;
    //OC   Lambda-like viruses; unclassified Lambda-like viruses.
    //OX   NCBI_TaxID=10703;
    //OH   NCBI_TaxID=1717; Corynebacterium diphtheriae.
    
    //1:10239:35237:28883:10699:186765:335795:10703.
    //G:335795;S:10703
    
    //TODO: Taxonomy is a bit more universally applicable than just in UniProt
    //- ENA (www.ebi.ac.uk/ena) and the INSDC, the wwPDB also rely heavily on taxonomy.
    // This would be a good place to make a unversally applicable module.
    //one thing which is somewhat broken is the lineage and the tax id are 
    //unlinked and any given tax id is devoid of meaning - for instance the two ids
    //in the example above are both species level codes, but there is no way of 
    //knowing this simply by looking at the IDs. 
    //The traditional method of comparing one orgainsm to another is by scientific name 
    //which takes the form: Genus species.
    //the species is the working unit of taxonomy as this is essentially a divisor
    //where breeding between individuals cannot produce viable offspring.
    //Below species level the sitauation gets very unwieldy with an unspecified 
    //number of levels - especially within the viruses which may have many sub-groups 
    //and isolates - HIV1 (http://www.ebi.ac.uk/ena/data/view/Taxon:11676&display=xml)
    //is an especially good example.
    //Ultimately a taxonomy would trace back to an individual and it's a bit of a

    //lineage
    //scientific name, common name, synonym, acronym
    //taxID, rank
}
