package NotificationPackage;
/**
 * @author Bryce
 */

public class CourseAssignment {
    String assignment_name;
    NotificationDate due_date;
    NotificationMessage notification_message;
    private float notification_hours_before_due;

    public CourseAssignment() {
        this.notification_message = new NotificationMessage();
        this.due_date = new NotificationDate();
    }

    /**
     * Change the due date of the assignment.
     *
     * @param new_day: the new due date (month/day)
     */
    public void changeDueDate(String new_day) {
        this.due_date.changeDay(new_day);
    }

    /**
     * Asks the user for input on creating the notification message.
     */
    public void createNotificationMessage() {
        this.notification_message.createMessage();
    }

    /**
     * Set how long before an assignment is due that a user wants to be able
     * to receive a notification.
     *
     * @param hours: hours before an assignment is due.
     */
    public void setWhenNotifiedBeforeDue(float hours) {
        this.due_date.send_hours_before = hours;
    }

    /**
     * Sets the assignment name.
     *
     * @param name: name of assignment.
     */
    public void setAssignmentName(String name) {this.assignment_name = name;}

    /**
     * Calls the function in NotificationDate to determine whether to
     * notify the user with a notification.
     *
     * @return true/false depending on if it should notify.
     */
    public boolean shouldNotify() {
        return this.due_date.shouldSend();
    }

    /**
     * Sends the notification message to the terminal for the user.
     */
    public void notifyWithMessage() {
        if (this.shouldNotify()) this.notification_message.sendMessage();
    }
}
