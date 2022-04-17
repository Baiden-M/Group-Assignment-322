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
 * @author Baiden McErloy
 * subject class that stores the assignments to print out
 */
public class HourData implements OutputObs{
    private List<Observer> observers;  //list of observers to update
    private List<Assignment> assignments; //list of assignments to print
    //constructor that creates the list of observers
    public HourData(){
        observers = new ArrayList<Observer>();
    }
    //adds an observer
    public void registerObserver(Observer o){
        observers.add(o);
    }
    //removes observer
    public void removeObserver(Observer o){
        observers.remove(o);
    }
    //updates observers
    public void notifyObservers(){
        for(Observer observer : observers){
            observer.update(assignments);
        }
    }
    //gets the assignments then notifies the observers
    public void getAssignments(List<Assignment> newAssignments){
        assignments = newAssignments;
        notifyObservers();
    }
    
}
