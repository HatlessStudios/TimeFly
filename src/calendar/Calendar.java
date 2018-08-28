package calendar;

import java.util.ArrayList;
import java.util.Collections;

public class Calendar {

    private ArrayList<Timeslot> data;

    public ArrayList<Timeslot> getData(){
        return data;
    }

    private void sortTime(){
        Collections.sort(data);
    }
    //TODO Implement RLE to cut out blank time slots. Dictionary encoding may also be a good idea.
}
