package GroupProject1.src.AssignmentPackage;
import java.util.*;
public class ImportTester {

    public static void main(String[] args) {

        ScheduleImport importer = new ScheduleImport();
        ArrayList<Assignment> records = importer.importSchedule();

        records.get(4).printFullAssignment();

    }

}