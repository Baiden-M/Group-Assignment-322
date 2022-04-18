package NotificationPackage;

/**
 * @author Bryce
 */

public abstract class SubjectOfNotification {
    protected String name_of_subject;

    /**
     * Any subject of notification must implement a setName function
     * in their class to set the name of what the subject is.
     *
     * @param name: name of subject.
     */
    public abstract void setName(String name);
}
