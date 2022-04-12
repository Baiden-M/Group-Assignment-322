package NotificationPackage;

public abstract class User {
    private String full_name;
    private String email_address;
    private Reminder[] reminders;

    public void openApplication() {

    }

    public void setEmail(String email) {
        this.email_address = email;
    }

    public void setReminder() {

    }
}
