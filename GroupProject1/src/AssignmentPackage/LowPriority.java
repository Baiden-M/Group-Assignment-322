package GroupProject1.src.AssignmentPackage;

public class LowPriority implements PriorityBehavior{
    
    String fullPrintMessage = "Take a look at this when you can: ";
    public String getMessage() {
        return fullPrintMessage;
    }
    
    @Override
    public String getPriority() {
        return "Low Priority";
    }
}
