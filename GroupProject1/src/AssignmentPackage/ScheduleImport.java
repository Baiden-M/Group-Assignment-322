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
    public ArrayList<Assignment> importSchedule() {
        String[][] records = new String[300][];
        int row_count = 0;
        try {   //this all reads the csv into an array of strings
            File file = new File("ScheduleData.csv");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            String[] tempArr;
            br.readLine();
            while ((line = br.readLine()) != null) {
                tempArr = line.split(",");
                records[row_count] = tempArr;
                row_count++;
            }

            br.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        // now to do something with it, we'll put it in objects
        ArrayList<Assignment> assignments = new ArrayList<Assignment>();
        for (int i=0; i < row_count; i++) {
            String type = records[i][0];
            Assignment newAss;
            if (type.equals("Homework")) {
                //assign to Homework object
                newAss = new Homework(records[i][1], records[i][2], records[i][3], 
                                      records[i][4], records[i][5], records[i][6]);
            } else if (type.equals("Quiz")) {
                //assign to Quiz object
                newAss = new Quiz(records[i][1], records[i][2], records[i][3], records[i][4], 
                                  records[i][5], records[i][9], records[i][10], records[i][11]);
            } else if (type.equals("Announcement")) {
                //assign to Announcement object
                newAss = new Announcement(records[i][1], records[i][2], records[i][5], records[i][7], records[i][8]);
            } else {
                System.out.println("Illegal Assignment Type found in import file.");
                System.out.println("Aborting");
                return assignments;
            }
            assignments.add(newAss);
        }
        return assignments;


    }



}