package NotificationPackage;

import java.util.Scanner;

public class NotificationDate {
    private int month;
    private int day;
    private int time_hour;
    private int time_minute;
    private final float send_hours_before;

    public NotificationDate() {
        this.send_hours_before = 0;
    }

    public NotificationDate(float hours_before) {
        this.send_hours_before = hours_before;
    }

    /**
     * Process of the user setting the due date by entering input.
     */
    public void setDate() {
        Scanner scan = new Scanner(System.in);

        System.out.println("------------------------------");

        // Get the due date month/day from the user.
        System.out.print("Please enter the due date in number form as month/day (i.e. 5/13): ");
        String month_day = scan.next();
        String[] month_day_split = month_day.split("/");
        this.month = Integer.parseInt(month_day_split[0]);
        this.day = Integer.parseInt(month_day_split[1]);

        // Get due date time from the user.
        System.out.print("Please enter, in military time, the time the assignment is due (i.e. 18:30): ");
        String time = scan.next();
        String[] time_split = time.split(":");
        this.time_hour = Integer.parseInt(time_split[0]);
        this.time_minute = Integer.parseInt(time_split[1]);


    }

    public String getDate() {
        return "Month: %d Day: %d Time: %d:%d".formatted(this.month,this.day,this.time_hour,this.time_minute);
    }

    public boolean shouldSend() {
        int[] current_date = {java.time.LocalDate.now().getMonth().getValue(),java.time.LocalDate.now().getDayOfMonth()};
        int[] current_time = {java.time.LocalTime.now().getHour(),java.time.LocalTime.now().getMinute()};

        // Check if the due date is in your current month.
        if (this.month == current_date[0]) {
            // Check if the due date is today or has passed.
            if (this.day == current_date[1]) {
                if (((float) this.time_hour * 60 + this.time_minute - ((float) current_time[0] * 60 + current_time[1])) / 60 <= this.send_hours_before) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        NotificationDate nd = new NotificationDate(5);
        nd.setDate();
        System.out.println("print date");
        System.out.println(nd.getDate());
        System.out.println("printing if should send");
        System.out.println(nd.shouldSend());
    }
}
