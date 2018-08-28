package calendar;

import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

public class Timeslot {

    private ArrayList<UUID> activIDs;
    private long ID;

    public Timeslot(int startTime){
        ID = startTime / 5;
    }

    public Timeslot(Date startTime){
        ID = Timeslot.convertDateToID(startTime);
    }

    public ArrayList<UUID> getActivIDs(){
        return activIDs;
    }

    public boolean isEmpty(){
        return (activIDs == null);
    }

    public long getID() {
        return ID;
    }

    public void addActivity(UUID activityID){
        activIDs.add(activityID);
    }

    public void remActivity(UUID activityID){
        activIDs.remove(activityID);
    }

    public Date getDate(){
        return Timeslot.convertIDToDate(ID);
    }

    private static Date convertIDToDate(long timeStart){
        return new Date(timeStart*5);
    }

    private static long convertDateToID(Date timeStart){
        return timeStart.getTime()/5;
    }
}
