package activity;

import java.util.ArrayList;
import java.util.UUID;

public class Activity {

    private UUID ID;
    private String name;
    private int timeID;
    // Duration of 1 = 5 minutes.
    private int duration;
    private ArrayList<String> notes;

    public Activity(String name, ArrayList<String> notes, int timeID) {

        this.name = name;
        this.notes = new ArrayList<>(notes);
        this.timeID = timeID;
        ID = UUID.fromString(name + timeID);
    }

    public UUID getID() {
        return ID;
    }

    public int getTimeID(){
        return timeID;
    }

    public String getName() {
        return name;
    }

    public ArrayList<String> getNotes() {
        return notes;
    }

    public void addNote(String toAdd){
        notes.add(toAdd);
        }

    /**
     * Removes the note at the given index.
     * @param index the index to be deleted.
     */
    public void removeNote(int index){
        notes.remove(index);
    }

    public void renameActivity(String newName){
        name = newName;
    }
}

