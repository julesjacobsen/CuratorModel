/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.ebi.uniprot.curatormodel.model;

import java.util.List;
import uk.ac.ebi.uniprot.curatormodel.xref.interfaces.Xref;

/**
 *
 * @author Jules Jacobsen <jacobsen@ebi.ac.uk>
 */
public interface Annotatable {

    public List<Comment> getComments();

    public List<Feature> getFeatures();

    public GeneNames getGeneNames();

    public InternalSection getInternalSection();

    public List<KeyWord> getKeywords();

    public ProteinNames getProteinNames();

    public Sequence getSequence();

    public List<Xref> getXrefs();

    public void setComments(List<Comment> comments);

    public void setFeatures(List<Feature> features);

    public void setGeneNames(GeneNames gn);

    public void setInternalSection(InternalSection internalSection);

    public void setKeywords(List<KeyWord> keywords);

    public void setProteinNames(ProteinNames proteinNames);

    public void setSequence(Sequence sequence);

    public void setXrefs(List<Xref> xrefs);
    
}
