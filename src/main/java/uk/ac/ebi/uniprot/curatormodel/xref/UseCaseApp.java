/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.ebi.uniprot.curatormodel.xref;

import java.util.ArrayList;
import java.util.List;
import uk.ac.ebi.uniprot.curatormodel.xref.interfaces.EmblXref;
import uk.ac.ebi.uniprot.curatormodel.xref.interfaces.Xref;

/**
 * Hello world!
 *
 */
public class UseCaseApp {

    public static void main(String[] args) {
        List<Xref> xrefs = new ArrayList<Xref>();

        XrefFactory xrefFactory = XrefFactory.getInstance();
        //DR   EMBL; Y00264; CAA68374.1; -; mRNA.
        Xref emblXref = xrefFactory.buildXref(Database.valueOfIgnoreCase("EMBL"), "Y00264", "CAA68374.1; -; mRNA");
        xrefs.add(emblXref);
        //DR   PDB; 1AAP; X-ray; 1.50 A; A/B=287-344.
        Xref pdbXref = xrefFactory.buildXref(Database.PDB, "1AAP", "X-ray; 1.50 A; A/B=287-344");
        xrefs.add(pdbXref);
        //DR   IPI; IPI00006608; -.
        Xref ipiXref = xrefFactory.buildXref(Database.IPI, "IPI00006608", "-");
        xrefs.add(ipiXref);
        //DR   RefSeq; NP_000475.1; NM_000484.3.
        xrefs.add(xrefFactory.buildXref(Database.RefSeq, "NP_000475.1", "NM_000484.3"));
        //DR   SWISS-2DPAGE; P05067; -.
        xrefs.add(xrefFactory.buildXref(Database.valueOfIgnoreCase("SWISS-2DPAGE"), "P05067", "-"));
        //DR   Ensembl; ENSBTAT00000008225; ENSBTAP00000008225; ENSBTAG00000006270.
        xrefs.add(xrefFactory.buildXref(Database.valueOfIgnoreCase("Ensembl"), "ENSBTAT00000008225", "ENSBTAP00000008225; ENSBTAG00000006270"));
        //DR   EnsemblBacteria; EBSTAT00000032812; EBSTAP00000031682; EBSTAG00000032810.
        xrefs.add(xrefFactory.buildXref(Database.valueOfIgnoreCase("EnsemblBacteria"), "EBSTAT00000032812", "EBSTAP00000031682; EBSTAG00000032810"));
        //DR   EnsemblFungi; YDR365W-B; YDR365W-B; YDR365W-B.
        xrefs.add(xrefFactory.buildXref(Database.valueOfIgnoreCase("EnsemblFungi"), "YDR365W-B", "YDR365W-B; YDR365W-B"));
        //DR   EnsemblMetazoa; FBtr0071603; FBpp0071529; FBgn0020306.
        xrefs.add(xrefFactory.buildXref(Database.valueOfIgnoreCase("EnsemblMetazoa"), "FBtr0071603", "FBpp0071529; FBgn0020306"));
        //DR   EnsemblPlants; AT1G66340.1; AT1G66340.1; AT1G66340.
        xrefs.add(xrefFactory.buildXref(Database.valueOfIgnoreCase("EnsemblPlants"), "AT1G66340.1", "AT1G66340.1; AT1G66340"));
        //DR   EnsemblProtists; DDB0305146; DDB0305146; DDB_G0286833.
        xrefs.add(xrefFactory.buildXref(Database.valueOfIgnoreCase("EnsemblProtists"), "DDB0305146", "DDB0305146; DDB_G0286833"));
        //DR   GO; GO:0030424; C:axon; ISS:UniProtKB.
        xrefs.add(xrefFactory.buildXref(Database.valueOfIgnoreCase("GO"), "GO:0030424", "C:axon; ISS:UniProtKB"));
        //DR   InterPro; IPR008155; Amyloid_glyco.
        xrefs.add(xrefFactory.buildXref(Database.valueOfIgnoreCase("InterPro"), "IPR008155", "Amyloid_glyco"));
        //DR   Gene3D; G3DSA:4.10.230.10; Amyloid_glyco_Abeta; 1.
        xrefs.add(xrefFactory.buildXref(Database.valueOfIgnoreCase("Gene3D"), "G3DSA:4.10.230.10", "Amyloid_glyco_Abeta; 1"));
        //DR   Pfam; PF10515; APP_amyloid; 1.
        xrefs.add(xrefFactory.buildXref(Database.valueOfIgnoreCase("Pfam"), "PF10515", "APP_amyloid; 1"));
        //DR   PRINTS; PR00203; AMYLOIDA4.
        //PRINTS and InterPro are anomalous in that they are the only two 
        //domain/family databases which do not have a fourth status field
        //do we add them as a DomainXrefImpl or just an XrefImpl?
        xrefs.add(xrefFactory.buildXref(Database.valueOfIgnoreCase("PRINTS"), "PR00203", "AMYLOIDA4"));
        //DR   SMART; SM00006; A4_EXTRA; 1.
        xrefs.add(xrefFactory.buildXref(Database.valueOfIgnoreCase("SMART"), "SM00006", "A4_EXTRA; 1"));
        //DR   SUPFAM; SSF56491; A4_extra; 1.
        xrefs.add(xrefFactory.buildXref(Database.valueOfIgnoreCase("SUPFAM"), "SSF56491", "A4_extra; 1"));
        //DR   Reactome; REACT_14797; Signaling by GPCR.
        xrefs.add(xrefFactory.buildXref(Database.valueOfIgnoreCase("Reactome"), "REACT_14797", "Signaling by GPCR"));
        //iterate over list of xrefs
        for (Xref xref : xrefs) {
            //print them out e.g. xref.toString()
            System.out.println(xref);
            //check their type
            System.out.println("xref database: " + xref.getDatabase());
            //print out the database id
            System.out.println("database id: " + xref.getId());
            //get the rest of the xref.getComment()
            System.out.println("database comment: " + xref.getDescription());

            //use non-standard xrefs for their specific uses...
            //e.g. get the chains and extents from a PdbXref

            //find out the molecule type (Enum needed) of an EMBL xref
            //DR   EMBL; U29082; AAA68403.1; -; Genomic_DNA.
            if (xref.getDatabase() == Database.EMBL) {
                System.out.println("Found and EMBL xref");
                //this is awkward - it's the 5th token on the line, 4th minus the databaseType, but 3rd in the comment....
                System.out.println("EMBL mol_type: " + xref.getDescriptionTokens()[2]);
                EmblXref emblRef = (EmblXref) xref;
                Database database = emblRef.getDatabase();
                System.out.println(database + " xref has protein id " + emblRef.getProteinId());
                System.out.println(database + " xref has status " + emblRef.getStatus());
                System.out.println(database + " xref has molType " + emblRef.getMoleculeType());
            }

        }
        //get a set of xrefs for a given database(s) e.g. all InterPro databases
        //get the match status of a DomainXref
        System.out.println("Domain database xrefs:");
        for (Xref xref : xrefs) {
            //PRINTS and InterPro are anomalous in that they are the only two 
            //domain/family databases which do not have a fourth status field
            //do we add them as a DomainXrefImpl or just an XrefImpl?
            if (xref.getDatabase().getCategory() == DatabaseCategory.DOMAIN_FAMILY) {
                if (DomainXrefImpl.class.isInstance(xref)) {
                    DomainXrefImpl domainXref = (DomainXrefImpl) xref;
                    System.out.println(domainXref);
                    //print out the protein id of each Ensembl xref
                    System.out.println(String.format("%s id: %s match status: %s", domainXref.getDatabase(), domainXref.getId(), domainXref.getMatchStatus()));

                } else {
                    System.out.println(xref);
                }
            }
        }
        //do whtever people do with an ENSEMBL xref
        //DR   Ensembl; ENSBTAT00000008225; ENSBTAP00000008225; ENSBTAG00000006270.   
        //DR   EnsemblBacteria; EBSTAT00000032812; EBSTAP00000031682; EBSTAG00000032810.
        //DR   EnsemblFungi; YDR365W-B; YDR365W-B; YDR365W-B.
        //DR   EnsemblMetazoa; FBtr0071603; FBpp0071529; FBgn0020306.
        //DR   EnsemblPlants; AT1G66340.1; AT1G66340.1; AT1G66340.
        //DR   EnsemblProtists; DDB0305146; DDB0305146; DDB_G0286833.
        System.out.println("Ensemble database xrefs:");
        for (Xref xref : xrefs) {
            //Find all the databases concerned with genome annotation
            if (xref.getDatabase().getCategory() == DatabaseCategory.GENOME_ANNOTATION) {
                //these should also all be EnsemblXref instances 
                if (EnsemblXrefImpl.class.isInstance(xref)) {
                    EnsemblXrefImpl ensemblXref = (EnsemblXrefImpl) xref;
                    System.out.println(ensemblXref);
                    //print out the protein id of each Ensembl xref
                    System.out.println("Protein id: " + ensemblXref.getProteinId());
                } else {
                    System.out.println(xref);
                }
            }
        }
        
        //XML writer case where a standard xref needs a special xml tag instead 
        //of the standard 'description' (REACTOME)
        for (Xref xref : xrefs) {
            if (xref.getDatabase() == Database.Reactome) {
                System.out.println(String.format("<property type=\"pathway name\" value=\"%s\"/>", xref.getDescription()));
            }
        }
    }
}
