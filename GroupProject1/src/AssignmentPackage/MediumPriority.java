package GroupProject1.src.AssignmentPackage;

public class MediumPriority implements PriorityBehavior{
    
    String fullPrintMessage = "Hey you should probably get on this: ";
    public String getMessage() {
        return fullPrintMessage;
    }
    
    @Override
    public String getPriority() {
        return "Medium Priority";
    }
}
