package uk.ac.ebi.curatormodel;

import uk.ac.ebi.uniprot.curatormodel.model.Accessions;
import uk.ac.ebi.uniprot.curatormodel.model.Citation;
import uk.ac.ebi.uniprot.curatormodel.model.CuratedCitation;
import uk.ac.ebi.uniprot.curatormodel.model.Entry;
import uk.ac.ebi.uniprot.curatormodel.util.CitationFactory;
import uk.ac.ebi.uniprot.curatormodel.util.EntryFactory;
import uk.ac.ebi.uniprot.curatormodel.xref.Database;
import uk.ac.ebi.uniprot.curatormodel.xref.EmblXrefImpl;
import uk.ac.ebi.uniprot.curatormodel.xref.XrefFactory;
import uk.ac.ebi.uniprot.curatormodel.xref.interfaces.EmblXref;
import uk.ac.ebi.uniprot.curatormodel.xref.interfaces.Xref;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        //this is how to use the model....
        Accessions accessions = new Accessions("P12345");
        System.out.println(accessions);
        
        Entry fullEntry = EntryFactory.getEntry(accessions);
        
        //this is the kind of thing a curator want's to do...
        
        //make a new citation from a paper
        CitationFactory citationFactory = CitationFactory.getInstance();
        String pubMedId = "1234567";
        Citation journalArticle = citationFactory.buildJournalCitation();
        journalArticle.setTitle("Awesome Stuff.");
        //what the hell is this?! A citation*Entry*!? OK the idea is that a
        //CitationEntry contains all the annotations derived from a citation, 
        //this actualy reflects a lot of what is in a FullEntry 
        //(aka. UniProt flatfile), hence the bastard child CitationEntry. Sorry.
        Entry citationEntry = EntryFactory.makeCitationEntry(journalArticle);
        
        //this just happened to have an EMBL DR line, or should I say this 
        //happened to have an EMBL submission and hence a sequence...
        XrefFactory xrefFactory = XrefFactory.getInstance();
        //DR   EMBL; Y00264; CAA68374.1; -; mRNA.
        Xref emblXref = xrefFactory.buildXref(Database.valueOfIgnoreCase("EMBL"), "Y00264", "CAA68374.1; -; mRNA");
        
        citationEntry.getXrefs().add(emblXref);
        //add a comment about how the protein was found to function
        
        //there was a variant found to the original sequence in the fullEntry
        
        //
        
        
    }
}
