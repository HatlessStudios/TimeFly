package calendar;

import activity.Activity;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Date;

public class Timeslot implements Comparable<Timeslot>{

    private ArrayList<Activity> activities = new ArrayList<>();
    private long ID;

    public Timeslot(int startTime){
        ID = startTime / 5;
    }

    public Timeslot(Date startTime){
        ID = Timeslot.convertDateToID(startTime);
    }

    public ArrayList<Activity> getActivities(){
        return activities;
    }

    public boolean isEmpty(){
        return (activities == null);
    }

    public long getID() {
        return ID;
    }

    public void addActivity(Activity activity){
        activities.add(activity);
    }

    public void remActivity(Activity activity){
        activities.remove(activity);
    }

    public Date getDate(){
        return Timeslot.convertIDToDate(ID);
    }

    private static Date convertIDToDate(long timeStart){
        return new Date(timeStart*5);
    }

    public static long convertDateToID(Date timeStart){
        return timeStart.getTime()/5;
    }

    @Override
    public int compareTo(@NotNull Timeslot compareSlot) {
        return (int)(this.ID - compareSlot.ID);
    }
}
