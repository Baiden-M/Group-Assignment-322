/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InputOutputPackage;

import GroupProject1.src.AssignmentPackage.Assignment;
import java.util.List;

/**
 *
 * @author Baiden McElroy
 * interface for observers
 */
public interface Observer {
    public void update(List<Assignment> assignments);
    
    public void display();
        
    
}
