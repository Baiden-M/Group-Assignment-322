/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InputOutputPackage;

/**
 *
 * @author silve
 */
public interface OutputObs {
    public void registerObserver();
        
    
    public void removeObserver();
        
    
    public void notifyObserver();
        
    
    public void getAssignments();
        
    
}
