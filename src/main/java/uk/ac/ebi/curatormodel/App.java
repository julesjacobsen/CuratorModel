package uk.ac.ebi.curatormodel;

import uk.ac.ebi.uniprot.curatormodel.model.*;
import uk.ac.ebi.uniprot.curatormodel.util.AnnotationFactory;
import uk.ac.ebi.uniprot.curatormodel.util.CitationFactory;
import uk.ac.ebi.uniprot.curatormodel.xref.Database;
import uk.ac.ebi.uniprot.curatormodel.xref.XrefFactory;
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
        
        AnnotatedEntry annotatedEntry = AnnotationFactory.getEntry(accessions);
        annotatedEntry.setAccessions(accessions);
        annotatedEntry.setId(new Identifier("NEW", "AWSOM"));
        //this is the kind of thing a curator want's to do...
        
        
        //make a new citation from a paper
        CitationFactory citationFactory = CitationFactory.getInstance();
        String pubMedId = "1234567";
        Citation journalArticle = citationFactory.buildJournalCitation();
        //would be cleaner using:
        //Citation journalArticle = citationFactory.buildCitation(CitationType.JOURNAL);
        journalArticle.setTitle("Awesome Stuff.");
        journalArticle.setPmid(pubMedId);
             
        //what the hell is this?! A citation*Annotatable*!? OK the idea is that an
        //AnnotatedCitation contains all the annotations derived from a citation, 
        //this actualy reflects a lot of what is in an AnnotatedEntry 
        //(aka. UniProt flatfile), hence the bastard child AnnotatedCitation. Sorry.
        
        //all curators have a tag to identify them and what they did in an entry
        String curatorTag = "JUJ";
        AnnotatedCitation annotatedCitation = AnnotationFactory.buildAnnotatedCitation(journalArticle, new EvidenceTag(curatorTag));
        
        // add this to the entry
        AnnotationFactory.addAnnotatedCitation(annotatedEntry, annotatedCitation);
        
        //this just happened to have an EMBL DR line, or should I say this 
        //happened to have an EMBL submission and hence a sequence...
        XrefFactory xrefFactory = XrefFactory.getInstance();
        //DR   EMBL; Y00264; CAA68374.1; -; mRNA.
        Xref emblXref = xrefFactory.buildXref(Database.valueOfIgnoreCase("EMBL"), "Y00264", "CAA68374.1; -; mRNA");
        
        AnnotationFactory.addXref(annotatedCitation, emblXref);
        //add a comment about how the protein was found to function
        AnnotationFactory.addComment(annotatedCitation, new Comment(CommentType.FUNCTION, "We still just don't know."));
        //there was a variant found to the original sequence in the fullEntry
        AnnotationFactory.addFeature(annotatedCitation, new Feature(FeatureKey.VARIANT, 23, 23, "G -> R (in LQT1; dbSNP:rs179489)."));
        
        
        //another publication:
        String pubMedId1 = "2345678";
        Citation journalArticle1 = citationFactory.buildJournalCitation();
        //would be cleaner using:
        //Citation journalArticle = citationFactory.buildCitation(CitationType.JOURNAL);
        journalArticle1.setTitle("Some things we found out.");
        journalArticle1.setPmid(pubMedId1);
        //gets added to another AnnotatedCitation - different curator too  
        AnnotatedCitation annotatedCitation1 = AnnotationFactory.buildAnnotatedCitation(journalArticle1, new EvidenceTag("KLP"));
        AnnotationFactory.addComment(annotatedCitation1, new Comment(CommentType.CATALYTIC_ACTIVITY, "Woop! + FAD = Noop! + H2O"));
        AnnotationFactory.addAnnotatedCitation(annotatedEntry, annotatedCitation1);

        
        
        //let's see how it looks at the entry level:
        System.out.println(annotatedEntry);
        
        //and the curated data as it was added:
        for (AnnotatedCitation annotCit : annotatedEntry.getAnnotatedCitations()) {
            System.out.println(annotCit);            
        }
    }
}
