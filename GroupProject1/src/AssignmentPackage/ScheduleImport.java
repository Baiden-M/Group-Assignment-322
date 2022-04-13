package GroupProject1.src.AssignmentPackage;

import java.util.*;
import java.io.*;
import java.text.SimpleDateFormat;

public class ScheduleImport {

    // fields
    String date;

    // constructor
    public ScheduleImport() {
        Date theDate = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("MM-dd-yyyy HH:mm:ss");
        this.date = formatter.format(theDate);
        System.out.println("Schedule Imported at : " + this.date);
    }

    // methods
    public void importSchedule() {

        try {
            File file = new File("ScheduleData.csv");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            String[] tempArr;
            while ((line = br.readLine()) != null) {
                tempArr = line.split(",");
                for (String tempStr : tempArr) {
                    System.out.print(tempStr + " ");
                }
                System.out.println();
            }
            br.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

    }



}