package GroupProject1.src.AssignmentPackage;

public abstract class  Assignment {
    PriorityBehavior priorityBehavior;
    String color;
    String dueDate;
    GroupProject1.src.AssignmentPackage.PriorityBehavior priorityLevel;


     public void addAssignment(String c, String d, String p){
         setColor(c);
         setDueDate(d);
     }
     public void deleteAssignment(){

     }
     public void printAssignment(){
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
     public String getPriorityBehavior() {
        return priorityLevel.getPriority();
     }

     public abstract void printFullAssignment();
}
