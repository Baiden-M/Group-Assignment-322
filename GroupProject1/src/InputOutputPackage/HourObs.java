/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InputOutputPackage;

import java.util.*;
import GroupProject1.src.AssignmentPackage.Assignment;

/**
 *
 * @author silve
 */
public class HourObs implements Observer{
    private HourData hourData;
    private List<Assignment> obsAssignments; 
    
    public HourObs(HourData hourData){
        obsAssignments = new ArrayList<Assignment>();
        this.hourData = hourData;
        hourData.registerObserver(this);
        
    }
    public void update(List<Assignment> assignments){
        obsAssignments = assignments;
        display();
    }
    
    public void display(){
        for(Assignment assign : obsAssignments){
            assign.printAssignment();
        }
        
    }
    
}
