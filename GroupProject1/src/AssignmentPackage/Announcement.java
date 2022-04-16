package GroupProject1.src.AssignmentPackage;

import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Announcement extends GroupProject1.src.AssignmentPackage.Assignment {

    // fields
    String title;
    Date dateAssigned;
    String course;
    String postedBy;
    String content;
    
    // constructors
    public Announcement() {
        this.priorityLevel = new LowPriority();
    }
    public Announcement(String title, String dateAssignedString, String course, 
                        String postedBy, String content) {
        this.priorityLevel = new LowPriority();
        this.title = title;
        try {
            this.dateAssigned = new SimpleDateFormat("MM/dd/yyyy").parse(dateAssignedString);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        this.course = course;
        this.postedBy = postedBy;
        this.content = content;
    }

    // methods
    public void printFullAssignment() {
        SimpleDateFormat f = new SimpleDateFormat("MMM dd, yyyy");
        System.out.println(priorityLevel.getMessage());
        System.out.println("  For " + course);
        System.out.println("    This Announcement - " + title + " - was posted on "+ f.format(dateAssigned) + " by " + postedBy);
        System.out.println("It reads:");
        System.out.println("    " + content);
    }


    // getter methods
    public String getTitle() { return this.title; }
    public Date getDateAssigned() { return this.dateAssigned; }
    public String getCourse() { return this.course; }
    public String getPostedBy() { return this.postedBy; }
    public String getContent() { return this.content; }

/* Should be fine having one call to this in Assignment class, just assign behavior in Announcement
    @Override
    public String getPriorityBehavior() {
        return priorityLevel.getPriority();
    }
*/





}
