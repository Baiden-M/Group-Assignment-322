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
public class HourData implements OutputObs{
    private List<Observer> observers;
    private List<Assignment> assignments;
   
    public HourData(){
        observers = new ArrayList<Observer>();
    }
    
    public void registerObserver(Observer o){
        observers.add(o);
    }
    public void removeObserver(Observer o){
        observers.remove(o);
    }
    public void notifyObservers(){
        for(Observer observer : observers){
            observer.update(assignments);
        }
    }
    public void getAssignments(List<Assignment> newAssignments){
        assignments = newAssignments;
        notifyObservers();
    }
    
}
