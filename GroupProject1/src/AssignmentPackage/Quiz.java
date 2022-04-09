package AssignmentPackage;

public class Quiz extends Assignment{

    public String getPriorityBehavior(){
        HighPriority priority = new HighPriority();
        return priority.getPriority();
    }
}
