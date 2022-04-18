package GroupProject1.src.AssignmentPackage;

/**
 * High Prioriy Behavior
 * @author Makayla
 */

public class HighPriority implements PriorityBehavior{

    String fullPrintMessage = "YOU MUST SET ASIDE THIS TIME: ";     // urgent message for High Priority
    public String getMessage() {
        return fullPrintMessage;        // returns this message
    }

    @Override
    public String getPriority() {
        return "High Priority";         // returns this priority name/type
    }
}
