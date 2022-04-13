package GroupProject1.src.AssignmentPackage;

import java.util.*;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class Homework extends Assignment{
    
    // fields
    String title;
    Date dateAssigned;
    Date dateDue;
    String timeDue;
    String course;
    String attachedFiles;

    // constructors
    public Homework() {
        this.priorityLevel = new MediumPriority();
    }
    public Homework(String title, String dateAssignedString, String dateDueString,
                    String timeDue, String course, String attachedFiles) {
        this.priorityLevel = new MediumPriority();
        this.title = title;
        try {
            this.dateAssigned = new SimpleDateFormat("MM/dd/yyyy").parse(dateAssignedString);
            this.dateDue = new SimpleDateFormat("MM/dd/yyyy").parse(dateDueString);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        this.timeDue = timeDue;
        this.course = course;
        this.attachedFiles = attachedFiles;
    }
    

    // methods
    public void printFullAssignment() {
        SimpleDateFormat f = new SimpleDateFormat("MMM dd, yyyy");
        System.out.println(priorityLevel.getMessage());
        System.out.println("  For " + course);
        System.out.println("    This Homework - " + title + " - is due at " + timeDue + " on " + f.format(dateDue));
        System.out.println("      Relevant files are attached: " + attachedFiles);
        System.out.println("        This was posted on " + f.format(dateAssigned));                                                      
    }

    // getter methods
    public String getTitle() { return this.title; }
    public Date getDateAssigned() { return this.dateAssigned; }
    public Date getDateDue() { return this.dateDue; }
    public String getTimeDue() { return this.timeDue; }
    public String getCourse() { return this.course; }
    public String getAttachedFiles() { return this.attachedFiles; }



/* I think one call i Assignment is enough, just assign behavior in Homework    
    @Override
    public String getPriorityBehavior() {
        return null;
    }
    //What are the differences between the three types of homework
    //I think that homework will have medium priority, quizzes high priority, announcments low priority
*/


}
