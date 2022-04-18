package GroupProject1.src.AssignmentPackage;
import java.util.*;
public class ImportTester {

    public static void main(String[] args) {

        ScheduleImport importer = new ScheduleImport();         // creates importing object
        ArrayList<Assignment> records = importer.importSchedule();  // imports from our file, returns list of Assignments

        records.get(4).printFullAssignment();       // test the print method on one Assignment in list of Assignments

    }

}