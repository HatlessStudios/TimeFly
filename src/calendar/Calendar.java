package calendar;

public class Calendar implements CalendarView {

    private Timeslot[] data;

    @Override
    public void showTimePeriod(boolean showDetail, Timeslot[] data) {

    }

    @Override
    public void moveActivity() {

    }

    @Override
    public Timeslot[] getCalendar(long unixStart, long unixFinish) {
        return new Timeslot[0];
    }
    //TODO Implement RLE to cut out blank time slots. Dictionary encoding may also be a good idea.
}
