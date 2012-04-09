/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.ebi.uniprot.curatormodel.model;

/**
 * Position and Region types for FeatureKeys.
 * @author Jules Jacobsen <jacobsen@ebi.ac.uk>
 */
public enum FeatureKeyType {
    //REGION can have a span of 1, MULTI_POSITION is a set of non-contiguous positions
    POSITION, REGION, MULTI_POSITION;
    
}
