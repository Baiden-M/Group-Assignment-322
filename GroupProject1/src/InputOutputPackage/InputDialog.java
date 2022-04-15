/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InputOutputPackage;

import GroupProject1.src.AssignmentPackage.Assignment;
import GroupProject1.src.AssignmentPackage.Quiz;
import java.util.*;


/**
 *
 * @author silve
 */
public class InputDialog {
    
    static InputDialog uniqueInput;
    private List<Assignment> assignments = new ArrayList<Assignment>();
    private InputDialog(){}
    public static synchronized InputDialog getInstance(){
        
        if(uniqueInput == null){
            uniqueInput = new InputDialog();
        }
        return uniqueInput;
    }
    public void runInput(){
        String input = "q";

        if(input == ("q")){
           Assignment assignment = new Quiz();
           assignment.addAssignment("Blue", "08/25/2022", assignment.getPriorityBehavior());

           //assignment.printAssignment();
           assignments.add(assignment);
           
        }
        printOutput();
    }
    public void printOutput(){
        HourData outputData = new HourData();
        HourObs observer = new HourObs(outputData);
        outputData.getAssignments(assignments);
    }
        
}
