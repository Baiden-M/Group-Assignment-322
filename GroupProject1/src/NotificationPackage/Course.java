package NotificationPackage;

import java.util.LinkedList;
import java.util.Scanner;

public class Course extends SubjectOfNotification {
    private LinkedList<CourseAssignment> assignments = new LinkedList<>();

    public void setName(String name) {
        this.name_of_subject = name;
    }

    public void addAssignment() {
        Scanner scan = new Scanner(System.in);
        CourseAssignment new_assignment = new CourseAssignment();
        System.out.println("Enter name of assignment: ");
        new_assignment.setAssignmentName(scan.nextLine());
        new_assignment.due_date.setDate();
        new_assignment.notification_message.createMessage();
        assignments.push(new_assignment);
    }

    public void removeAssignment() {
        if (assignments.size() == 0) {
            System.out.println("No assignments to remove.");
        }
        else {
            Scanner scan = new Scanner(System.in);
            System.out.println("Here are the assignments for " + this.name_of_subject);
            System.out.println("-------------------------------------------");
            for (int i = 0; i < assignments.size(); i++) {
                System.out.println(assignments.get(i).assignment_name);
            }
            System.out.println("-------------------------------------------");
            System.out.println("Which assignment would you like to remove? Enter its name:");
            String remove = scan.nextLine();

            for (int i = 0; i < assignments.size(); i++) {
                if (assignments.get(i).assignment_name.equals(remove)) assignments.remove(i);
            }
        }
    }
}
