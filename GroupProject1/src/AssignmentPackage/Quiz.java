package GroupProject1.src.AssignmentPackage;

import java.util.*;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class Quiz extends Assignment{

    // fields
    String title;
    Date dateAssigned;
    Date dateDue;
    String timeDue;
    String course;
    Date dateOpen;
    String timeOpen;
    String duration;

    // constructors
    public Quiz() {
        this.priorityLevel = new HighPriority();
    }
    public Quiz(String title, String dateAssignedString, String dateDueString, String timeDue, 
                String course, String dateOpenString, String timeOpen, String duration) {
        this.priorityLevel = new HighPriority();
        this.title = title;
        try {
            SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
            this.dateAssigned = format.parse(dateAssignedString);
            this.dateDue = format.parse(dateDueString);
            this.dateOpen = format.parse(dateOpenString);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        this.course = course;
        this.timeDue = timeDue;
        this.timeOpen = timeOpen;
        this.duration = duration;
    }


    // methods
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



/* I think calling this once in Assignment is fine, just assign behavior in Quiz
    public String getPriorityBehavior(){
        HighPriority priority = new HighPriority();
        return priority.getPriority();
    }
*/


}
