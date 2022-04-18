package GroupProject1.src.AssignmentPackage;
/**
 * Asbstract Assignment Class
 * @author Makayla
 */

// Abstract Assignment class (extended by Quiz, Homework, Announcement)
public abstract class  Assignment {
    String color;       // color for printing purposes
    String dueDate;
    String name;
    GroupProject1.src.AssignmentPackage.PriorityBehavior priorityLevel; // every Assignment has priority behavior, set when created



     public void addAssignment(String n, String c, String d, String p){ //add assignment with color and due date
         setTitle(n);
         setColor(c);
         setDueDate(d);
     }
     public void deleteAssignment(){

     }
     public void printAssignment(){// prints basic parts of the Assignment
         System.out.println(getTitle());
         System.out.println(getPriorityBehavior());
         System.out.println(getColor());
         System.out.println(getDueDate());
         System.out.println(" ");
     }
     public void setColor(String c){
        color = c;
     } //set the color of the assignment
     public String getColor(){
         return color;
     } //get the color of the assignment
     public void setNotificationTime(){

     }
     public void setDueDate(String d){
         dueDate = d;
     } //se the due date of the assignment
     public String getDueDate(){
        return dueDate;
     } //get the due date of the assignment
     public String getPriorityBehavior() {      // could use priority behavior to determine Notification behavior
        return priorityLevel.getPriority();
     } //get priority behabior

    public void setTitle(String n){name = n;}
    public String getTitle(){ return name;}

     public abstract void printFullAssignment();    // defined in child class, prints assignment in full description mode
}
