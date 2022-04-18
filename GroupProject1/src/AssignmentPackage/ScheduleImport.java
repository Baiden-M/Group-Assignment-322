package GroupProject1.src.AssignmentPackage;

import java.util.*;
import java.io.*;
import java.text.SimpleDateFormat;

/*
    This class is an object that imports all data about assignments
    This simulates reading from D2L, we don't have access to D2L database
    Instead we read from a nicely formatted csv file with data about quizzes, hw, and anncmnts.
*/

public class ScheduleImport {

    // fields
    String date;    // we will track when an import occurs

    // constructor
    public ScheduleImport() {
        Date theDate = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("MM-dd-yyyy HH:mm:ss");   // format of date/time object
        this.date = formatter.format(theDate);
        System.out.println("Schedule Imported at : " + this.date);      // print when import begins, track this date/time
    }

    // methods
    // the one method that imports the schedule info from csv file/D2L in the future
    public ArrayList<Assignment> importSchedule() {
        String[][] records = new String[300][];         // 2D array of info (can hold 300 assignments)
        int row_count = 0;
        try {                   // this all reads the csv into an array of strings
            File file = new File("ScheduleData.csv");   // opens the nice csv file we have
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            String[] tempArr;
            br.readLine();      // read away column headers
            while ((line = br.readLine()) != null) {
                tempArr = line.split(",");
                records[row_count] = tempArr;
                row_count++;
            }

            br.close();
        } catch (IOException ioe) {     // error catching for some open/close errors we might get with IO objects
            ioe.printStackTrace();
        }

        // now to do something with it, we'll put it in objects
        // this is kind of a simple factory problem with the strategy pattern for assigning priority behavior
        ArrayList<Assignment> assignments = new ArrayList<Assignment>();    // holds all assignments
        for (int i=0; i < row_count; i++) {     // loops through as many rows in records we filled with assignment data
            String type = records[i][0];    // type of assignment (Quiz, Homework, Announcement)
            Assignment newAss;              // declares new Assignment variable
            if (type.equals("Homework")) {
                //assign to Homework object
                newAss = new Homework(records[i][1], records[i][2], records[i][3],      // with data from file, this corresponds to the columns holding
                                      records[i][4], records[i][5], records[i][6]);     // title, date assign, date due, time due, course, attached files
            } else if (type.equals("Quiz")) {
                //assign to Quiz object
                newAss = new Quiz(records[i][1], records[i][2], records[i][3], records[i][4],       // with data from file, this corresponds to the columns holding
                                  records[i][5], records[i][9], records[i][10], records[i][11]);    // title, date assign, date due, time due, course, date open, time open, duration
            } else if (type.equals("Announcement")) {
                //assign to Announcement object
                newAss = new Announcement(records[i][1], records[i][2], records[i][5],   // with from file, this corresponds to the columns holding
                                          records[i][7], records[i][8]);                 // title, date assign, course, posted by, content
            } else {
                System.out.println("Illegal Assignment Type found in import file.");    // this if we find an assignment without an approved type, it's skipped
                System.out.println("No Assignment object created for this line in import file.");
                continue;       // and it skips to the next iteration of for loop without trying to add newAss to assignments
            }
            assignments.add(newAss);
        }
        return assignments;     // returns list of Assignment objects


    }



}