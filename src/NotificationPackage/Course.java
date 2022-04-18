package NotificationPackage;

import java.util.LinkedList;
import java.util.Scanner;
/**
 * @author Bryce
 */

/**
 * This class contains information for adding/removing assignments
 * for a class and receiving the notifications from them.
 */
public class Course extends SubjectOfNotification {
    private LinkedList<CourseAssignment> assignments = new LinkedList<>();

    /**
     * Set the name of the course.
     *
     * @param name: name of subject.
     */
    public void setName(String name) {
        this.name_of_subject = name;
    }

    public LinkedList<CourseAssignment> getAssignments() {
        return this.assignments;
    }

    /**
     * Add an assignment to the course. This will push a new assignment onto
     * the linked list of assignments.
     */
    public void addAssignment() {
        Scanner scan = new Scanner(System.in);
        CourseAssignment new_assignment = new CourseAssignment();
        System.out.println("Enter name of assignment: ");
        new_assignment.setAssignmentName(scan.nextLine());
        new_assignment.due_date.setDate();
        System.out.print("How many hours before its due would you like to be notified? ");
        float hours = scan.nextFloat();
        new_assignment.setWhenNotifiedBeforeDue(hours);
        new_assignment.notification_message.createMessage();
        assignments.push(new_assignment);
    }

    /**
     * Remove an assignment from the linked list. Will ask the user for the
     * name of the assignment they want to remove, and remove it if it exists.
     */
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
            System.out.println("Which assignment would you like to remove? Enter its name: ");
            String remove = scan.nextLine();

            for (int i = 0; i < assignments.size(); i++) {
                if (assignments.get(i).assignment_name.equals(remove)) assignments.remove(i);
            }
        }
    }

    public static void main(String[] args) {
        Course math = new Course();
        math.addAssignment();

        for (CourseAssignment as : math.assignments) {
            as.notifyWithMessage();
        }
    }
}
