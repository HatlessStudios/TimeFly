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

    public void createEvent(Date startTime, Activity activity){
        long timeslotID = Timeslot.convertDateToID(startTime);
        for (Timeslot datum : data) {
            if (datum.getID() == timeslotID){
                //TODO Add activities spanning longer than 1 timeslot
                datum.addActivity(activity);
                return;
            }
        }
        //TODO This involves calculating the ID twice
        Timeslot newSlot = new Timeslot(startTime);
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
    //TODO Implement RLE to cut out blank time slots. Dictionary encoding may also be a good idea.
}
