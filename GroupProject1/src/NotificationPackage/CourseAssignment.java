package NotificationPackage;

public class CourseAssignment {
    String assignment_name;
    NotificationDate due_date;
    NotificationMessage notification_message;
    private float notification_hours_before_due;

    public void changeDueDate(String new_day) {
        this.due_date.changeDay(new_day);
    }

    public void createNotificationMessage() {
        this.notification_message.createMessage();
    }

    public void setWhenNotifiedBeforeDue(float hours) {
        this.due_date.send_hours_before = hours;
    }

    public void setAssignmentName(String name) {this.assignment_name = name;}

    public boolean shouldNotify() {
        return this.due_date.shouldSend();
    }

    public void notifyWithMessage() {
        if (this.shouldNotify()) this.notification_message.sendMessage();
    }
}
