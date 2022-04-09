public class Driver {

    public static void main(String[] args) {


        String input = "q";

        if(input == "q"){
           Assignment assignment = new Quiz();
           assignment.addAssignment("Blue", "08/25/2022", assignment.getPriorityBehavior());

           assignment.printAssignment();


        }
    }
}
