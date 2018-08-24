package activity;

import java.util.ArrayList;

public class Activity {

    private final int ID;
    private String name;
    private ArrayList<String> notes;

    public Activity(int id, String name, ArrayList<String> notes) {

        ID = id;
        this.name = name;
        this.notes = new ArrayList<>(notes);
    }

    public int getID() {
        return ID;
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

    public void removeNote(String toRemove){
        notes.remove(toRemove);
    }

    public void renameActivity(String newName){
        name = newName;
    }
}

