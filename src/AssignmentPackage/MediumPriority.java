package GroupProject1.src.AssignmentPackage;
/**
 * Medium Priority Behavior
 * @author Makayla
 */

public class MediumPriority implements PriorityBehavior{
    
    String fullPrintMessage = "Hey you should probably get on this: ";      // moderate message for Medium Priority
    public String getMessage() {    // returns that message
        return fullPrintMessage;
    }
    
    @Override
    public String getPriority() {
        return "Medium Priority";   // returns the Priority Name/Type
    }
}
