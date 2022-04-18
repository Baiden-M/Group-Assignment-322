package GroupProject1.src.AssignmentPackage;

import java.util.*;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class Homework extends Assignment{
    
    // fields
    String title;           // title of the homework assignment
    Date dateAssigned;      // date the homework was assigned/posted
    Date dateDue;           // date the hw is due
    String timeDue;         // time the hw is due HH:MM AM/PM
    String course;          // course number (CSCI 338)
    String attachedFiles;   // names of files that are attached

    // constructors

    // creates empty Homework object, sets priority
    public Homework() {
        this.priorityLevel = new MediumPriority();      // all homeworks are set with medium priority behavior
    }

    // creates Homework object with all info to fill in data attributes
//    public Homework(String title, String dateAssignedString, String dateDueString,
//                    String timeDue, String course, String attachedFiles) {
//        this.priorityLevel = new MediumPriority();      // all homeworks set with medium priority behavior
//        this.title = title;
//        try {
//            this.dateAssigned = new SimpleDateFormat("MM/dd/yyyy").parse(dateAssignedString);   // sets format and parses
//            this.dateDue = new SimpleDateFormat("MM/dd/yyyy").parse(dateDueString);             // string dates into Date objects
//        } catch (ParseException e) {    // catching parsing errors from this type changing
//            e.printStackTrace();
//        }
//        this.timeDue = timeDue;
//        this.course = course;
//        this.attachedFiles = attachedFiles;
//    }
    

    // methods

    // print this Homework Assignment in full description format
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
    public void setDateDue(String date) {
        try{
            SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");   // sets format for Date objects
            this.dateDue = format.parse(date);
        } catch (ParseException e) {        // again with the error catch
            e.printStackTrace();
        }
    }
    public void setTimeDue(String time) { this.timeDue = time; }
    public void setCourse(String course) { this.course = course; }
    public void setAttachedFiles(String files) { this.attachedFiles = files; }  // one string, could be list of files with commas (file1.pdf, file4.docx, etc.)


/* I think one call i Assignment is enough, just assign behavior in Homework    
    @Override
    public String getPriorityBehavior() {
        return null;
    }
    //What are the differences between the three types of homework
    //I think that homework will have medium priority, quizzes high priority, announcments low priority
*/


}
