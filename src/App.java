import activity.Activity;
import calendar.Calendar;

public class App {

    public static void main(String[] args){
        Calendar calendar = new Calendar();
        Activity activity = new Activity("Test", System.currentTimeMillis(), 1);
        calendar.createEvent(activity);
        calendar.displayCalendar();
    }
}
