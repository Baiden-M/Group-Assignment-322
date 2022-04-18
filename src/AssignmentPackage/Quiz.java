package GroupProject1.src.AssignmentPackage;

import java.util.*;
import java.text.SimpleDateFormat;
import java.text.ParseException;
/**
 * Class that creates quizzes
 * @author Makayla and Jacob
 */

public class Quiz extends Assignment{

    // fields
    String title;           // title of the quiz
    Date dateAssigned;      // date the quiz was assigned/posted
    Date dateDue;           // date the quiz is due
    String timeDue;         // time the quiz is due HH:MM AM/PM
    String course;          // course number (CSCI 338)
    Date dateOpen;          // date the quiz opens, becomes available
    String timeOpen;        // time the quiz opens  HH:MM AM/PM
    String duration;        // how long you have to take the quiz once started HH:MM:SS

    
    // constructors

    // creates empty Quiz object, sets priority
    public Quiz() {
        this.priorityLevel = new HighPriority();    // all quizzes set with high priority behavior
    }
    // creates Quiz object with all info to fill data attributes
    public Quiz(String title, String dateAssignedString, String dateDueString, String timeDue, 
                String course, String dateOpenString, String timeOpen, String duration) {
        this.priorityLevel = new HighPriority();    // all quizzes set with high priority behavior
        this.title = title;
        try {
            SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");   // sets format for Date objects
            this.dateAssigned = format.parse(dateAssignedString);                   // parse string date into Date
            this.dateDue = format.parse(dateDueString);                             // parse string date into Date
            this.dateOpen = format.parse(dateOpenString);                           // parse string date into Date
        } catch (ParseException e) {    // catching parsing errors from this type changing
            e.printStackTrace();
        }
        this.course = course;
        this.timeDue = timeDue;
        this.timeOpen = timeOpen;
        this.duration = duration;
    }


    // methods
    
    // print this Quiz Assignment in full description format
    public void printFullAssignment() {
        SimpleDateFormat f = new SimpleDateFormat("MMM dd, yyyy");
        System.out.println(priorityLevel.getMessage());
        System.out.println("  For " + course);
        System.out.println("    This Quiz - " + title + " - is due at " + timeDue + " on " + f.format(dateDue));
        System.out.println("      It will open at " + timeOpen + " on " + f.format(dateOpen) + " and you will have " + duration + " to complete it. ");
        System.out.println("        This was posted on " + f.format(dateAssigned));                                                      
    }

    // getter methods
    public String getTitle() { return this.title; }
    public Date getDateAssigned() { return this.dateAssigned; }
    public Date getDateDue() { return this.dateDue; }
    public String getTimeDue() { return this.timeDue; }
    public String getCourse() { return this.course; }
    public Date getDateOpen() { return this.dateOpen; }
    public String getTimeOpen() { return this.timeOpen; }
    public String getDuration() { return this.duration; }

    // setter methodcs
    public void setTitle(String title) { this.title = title; }
    public void setDateAssigned(String date) {
        try {
            SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");   // sets format for Date objects
            this.dateAssigned = format.parse(date);                   // parse string date into Date
        } catch (ParseException e) {    // catching parsing errors from this type changing
            e.printStackTrace();
        }
    }
    public void setDateDue(String date) {
        try {
            SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");   // sets format for Date objects
            this.dateDue = format.parse(date);                   // parse string date into Date
        } catch (ParseException e) {    // catching parsing errors from this type changing
            e.printStackTrace();
        }
    }
    public void setTimeDue(String time) { this.timeDue = time; }
    public void setCourse(String course) { this.course = course; }
    public void setDateOpen(String date) {
        try {
            SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");   // sets format for Date objects
            this.dateOpen = format.parse(date);                   // parse string date into Date
        } catch (ParseException e) {    // catching parsing errors from this type changing
            e.printStackTrace();
        }
    }
    public void setTimeOpen(String time) { this.timeOpen = time; }
    public void setDuration(String time) {this.duration = time; }



/* I think calling this once in Assignment is fine, just assign behavior in Quiz
    public String getPriorityBehavior(){
        HighPriority priority = new HighPriority();
        return priority.getPriority();
    }
*/


}
