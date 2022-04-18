package GroupProject1.src.AssignmentPackage;

public class LowPriority implements PriorityBehavior{
    
    String fullPrintMessage = "Take a look at this when you can: ";     // returns low key message for Low Priority
    public String getMessage() {
        return fullPrintMessage;    // returns that message
    }
    
    @Override
    public String getPriority() {
        return "Low Priority";      // returns this priority name/type
    }
}
