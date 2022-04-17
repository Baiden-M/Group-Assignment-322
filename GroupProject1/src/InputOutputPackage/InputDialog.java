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
 * @author Baiden McElroy
 * singleton class that controls input from a scanner
 */
public class InputDialog {
    
    static InputDialog uniqueInput;    //singleton class instance      
    private List<Assignment> assignments = new ArrayList<Assignment>();
    private InputDialog(){}
    /*
        controls singleton instances
        returns singleton instance
    */
    public static synchronized InputDialog getInstance(){  
        
        if(uniqueInput == null){
            uniqueInput = new InputDialog();
        }
        return uniqueInput;
    }
    /*
        controls input to call other classes
        uses scanner to get user input
    */
    public void runInput(){
        Scanner scanner = new Scanner(System.in);
        String input = "";
        
        while(!input.equals("q")){
            System.out.println("Enter choice: a for assignment, q for quit");
            input = scanner.nextLine();


            if(input.equals("a")){
               Assignment assignment = new Quiz();    //creates an assignment of type quiz
               assignment.addAssignment("Blue", "08/25/2022", assignment.getPriorityBehavior());
               assignments.add(assignment); //adds assignment to the observer

            }
            printOutput(); //calls print method to update observers
        }
    }
    /*
        updates observers which will print assignments
    */
    public void printOutput(){
        HourData outputData = new HourData();
        HourObs observer = new HourObs(outputData);
        outputData.getAssignments(assignments);
    }
        
}
