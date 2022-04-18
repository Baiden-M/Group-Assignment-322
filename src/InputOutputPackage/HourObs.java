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
 * @author Baiden McElroy
 * Observer that prints out assignment data
 */
public class HourObs implements Observer{
    private HourData hourData;
    private List<Assignment> obsAssignments; 
    //adds this observer to the observer list in HourData
    public HourObs(HourData hourData){
        obsAssignments = new ArrayList<Assignment>();
        this.hourData = hourData;
        hourData.registerObserver(this);
        
    }
    //updates this observer, which dispays the data
    public void update(List<Assignment> assignments){
        obsAssignments = assignments;
        display();
    }
    //displays assignment data
    public void display(){
        for(Assignment assign : obsAssignments){
            assign.printAssignment();
        }
        
    }
    
}
