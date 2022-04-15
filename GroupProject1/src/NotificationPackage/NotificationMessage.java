package NotificationPackage;

import java.util.Scanner;

/**
 * Class that contains the message for the notification.
 */
public class NotificationMessage {
    private String message_content;

    /**
     * Asks the user to enter the message used in the notification.
     */
    public void createMessage() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the content of your notification message you wish to receive:");
        String message = scan.nextLine();

        this.message_content = message;
    }

    /**
     * Sends the notification message to the user (in the terminal for this project).
     */
    public void sendMessage() {
        System.out.println(this.message_content);
    }
}
