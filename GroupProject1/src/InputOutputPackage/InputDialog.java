/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InputOutputPackage;

import GroupProject1.src.AssignmentPackage.Assignment;
import GroupProject1.src.AssignmentPackage.Quiz;
import CreateUserPackage.User;
import CreateUserPackage.Student;
import CreateUserPackage.Database;
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
    Scanner scanner = new Scanner(System.in);
    String input = "";
    /**
    *    controls singleton instances
    *    returns singleton instance
    */
    public static synchronized InputDialog getInstance(){  
        
        if(uniqueInput == null){
            uniqueInput = new InputDialog();
        }
        return uniqueInput;
    }
    /**
     *   controls input to call other classes
     *   uses scanner to get user input
     */
    public void runInput(){
        
        
        while(!input.equals("quit")){
            System.out.println("Enter choice: assignment, notification, user, login, message, quit");
            input = scanner.nextLine();

            switch(input){
                case "assignment":
                    addAssignment();
                    break;
                case "quit":
                    break;
                case "notification":
                    sendNotification();
                    break;
                case "user":
                    createUser();
                    break;
                case "login":
                    login();
                    break;
                case "message":
                    sendMessage();
                    break;
                default:
                    System.out.println("Enter a valid input");
                    
                    
            }
            
            printOutput(); //calls print method to update observers
        }
    }
    /**
     * prompts user to add information to create an assignment
     */
    public void addAssignment(){
        System.out.println("Enter assignment type: quiz, homework");
        input = scanner.nextLine();
        if(input.equals("quiz")){
            Assignment assignment = new Quiz(); //creates an assignment of type quiz
            String color, date;
            System.out.println("enter quiz color");
            color = scanner.nextLine();
            System.out.println("enter quiz date: ex 08/25/2022");
            date = scanner.nextLine();
            assignment.addAssignment(color, date, assignment.getPriorityBehavior());
            assignments.add(assignment); //adds assignment to the observer
        }
        else if(input.equals("homework")){
            Assignment assignment = new Quiz(); //creates an assignment of type homework
            String color, date;
            System.out.println("enter homework color");
            color = scanner.nextLine();
            System.out.println("enter homework date: ex 08/25/2022");
            date = scanner.nextLine();
            assignment.addAssignment(color, date, assignment.getPriorityBehavior());
            assignments.add(assignment); //adds assignment to the observer
        }
        else{
            System.out.println("incorrect assignment type");
        }
                                    
    }
    /**
     * creates a notification
     */
    public void sendNotification(){
        
    }
    /**
     * creates a user
     */
    public void createUser(){
        User student = new Student();
    }
    /**
     * Logs into account
     */
    public void login()
    {
        Database d = Database.getInstance();
        System.out.println("Enter your username");
        String un = scanner.nextLine();
        System.out.println("Enter your password");
        String pass = scanner.nextLine();
        if(d.login.get(un) == null)
        {
            System.out.println("Incorrect username or password");
        }
        else if ((d.login.get(un)).equals(pass))
        {
            System.out.println("Successfully Logged In");
        }
        else
        {
            System.out.println("Incorrect username or password");
        }
    }
    /**
     * sends a message
     */
    public void sendMessage(){
        
    }
    
    /**
    *   updates observers which will print assignments
    */
    public void printOutput(){
        HourData outputData = new HourData();
        HourObs observer = new HourObs(outputData);
        outputData.getAssignments(assignments);
    }
        
}
