package calendar;

import activity.Activity;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Date;

public class Timeslot implements Comparable<Timeslot>{

    private ArrayList<Activity> activities = new ArrayList<>();
    private long ID;

    public Timeslot(long startTime){
        ID = startTime / 5;
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

    public long getTime(){
        return ID;
    }

    private static long convertIDToTime(long timeStart){
        return timeStart*5;
    }

    @Override
    public int compareTo(@NotNull Timeslot compareSlot) {
        return (int)(this.ID - compareSlot.ID);
    }
}
