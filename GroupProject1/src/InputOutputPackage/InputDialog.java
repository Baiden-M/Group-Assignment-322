/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InputOutputPackage;

import AssignmentPackage.Assignment;
import AssignmentPackage.Quiz;


/**
 *
 * @author silve
 */
public class InputDialog {
    
    static InputDialog uniqueInput;
    
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

           assignment.printAssignment();


        }
    }
    public void printOutput(){
        
    }
        
}
