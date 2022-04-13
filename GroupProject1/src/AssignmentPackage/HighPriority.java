package GroupProject1.src.AssignmentPackage;

public class HighPriority implements PriorityBehavior{

    String fullPrintMessage = "YOU MUST SET ASIDE THIS TIME: ";
    public String getMessage() {
        return fullPrintMessage;
    }

    @Override
    public String getPriority() {
        return "High Priority";
    }
}
