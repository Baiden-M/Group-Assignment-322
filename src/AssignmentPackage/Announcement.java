package GroupProject1.src.AssignmentPackage;

import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
/**
 * Class that creates Annoucements
 * @author Makayla and Jacob
 */
public class Announcement extends GroupProject1.src.AssignmentPackage.Assignment {

    // fields
    String title;           // title of announcement
    Date dateAssigned;      // date the announcement was posted
    String course;          // course number (CSCI 338)
    String postedBy;        // name of person (prof) who posted announcement (could work for discussion posts later)
    String content;         // content of the post
    

    // constructors
    
    // creates empty Announcement object, sets priority
    public Announcement() {
        this.priorityLevel = new LowPriority();     // all announcements set with low priority behavior
    }
    // creates Announcement object with all info to fill data attributes
    public Announcement(String title, String dateAssignedString, String course, 
                        String postedBy, String content) {
        this.priorityLevel = new LowPriority();     // all announcements set with low priority behavior
        this.title = title;
        try {
            this.dateAssigned = new SimpleDateFormat("MM/dd/yyyy").parse(dateAssignedString);   // sets format and turns string to Date
        } catch (ParseException e) {    // catching the parsing errors from this type changing
            e.printStackTrace();
        }
        this.course = course;
        this.postedBy = postedBy;
        this.content = content;
    }


    // methods
    
    // print this Announcement Assignment in full description format
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

    // setter methods
    public void setTitle(String title) { this.title = title; }
    public void setDateAssigned(String date) {
        try{
            SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");   // sets format for Date objects
            this.dateAssigned = format.parse(date);
        } catch (ParseException e) {        // again with the error catch
            e.printStackTrace();
        }
    }
    public void setCourse(String course) { this.course = course; }
    public void setPostedBy(String poster) { this.postedBy = poster; }
    public void setContent(String longContentString) { this.content = longContentString; }


/* Should be fine having one call to this in Assignment class, just assign behavior in Announcement
    @Override
    public String getPriorityBehavior() {
        return priorityLevel.getPriority();
    }
*/





}
