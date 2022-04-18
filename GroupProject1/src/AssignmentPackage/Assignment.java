package GroupProject1.src.AssignmentPackage;

// Abstract Assignment class (extended by Quiz, Homework, Announcement)
public abstract class  Assignment {
    String color;       // color for printing purposes
    String dueDate;
    GroupProject1.src.AssignmentPackage.PriorityBehavior priorityLevel; // every Assignment has priority behavior, set when created



     public void addAssignment(String c, String d, String p){
         setColor(c);
         setDueDate(d);
     }
     public void deleteAssignment(){

     }
     public void printAssignment(){                    // prints basic parts of the Assignment
         System.out.println(getPriorityBehavior());
         System.out.println(getColor());
         System.out.println(getDueDate());
     }
     public void setColor(String c){
        color = c;
     }
     public String getColor(){
         return color;
     }
     public void setNotificationTime(){

     }
     public void setDueDate(String d){
         dueDate = d;
     }
     public String getDueDate(){
        return dueDate;
     }
     public String getPriorityBehavior() {      // could use priority behavior to determine Notification behavior
        return priorityLevel.getPriority();
     }

     public abstract void printFullAssignment();    // defined in child class, prints assignment in full description mode
}
