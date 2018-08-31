package calendar;

import activity.Activity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

public class Calendar {

    private ArrayList<Timeslot> data;

    public ArrayList<Timeslot> getData(){
        return data;
    }

    public void createEvent(Activity activity){
        long timeslotID = activity.getTimeID();
        for (Timeslot datum : data) {
            if (datum.getID() == timeslotID){
                //TODO Add activities spanning longer than 1 timeslot
                datum.addActivity(activity);
                return;
            }
        }
        //TODO This involves calculating the ID twice
        Timeslot newSlot = new Timeslot(timeslotID);
        data.add(newSlot);
        newSlot.addActivity(activity);
        Collections.sort(data);
    }

    public void removeEvent(Activity toRem){
        for (Timeslot datum : data) {
            for (Activity ac : datum.getActivities()) {
                if (ac.equals(toRem)){
                    datum.remActivity(ac);
                }
            }
        }
    }

    public void displayCalendar(boolean showDetail){
        for (Timeslot datum : data) {
            for (Activity activity : datum.getActivities()) {
                System.out.println("ID: " + activity.getID() + "   Name: " + activity.getName() +
                        "   TimeID: "+ activity.getTimeID() + "   Notes: " + activity.getNotes());
            }
        }
    }

    public void displayCalendar(){
        displayCalendar(false);
    }
    //TODO Implement RLE to cut out blank time slots. Dictionary encoding may also be a good idea.
}
