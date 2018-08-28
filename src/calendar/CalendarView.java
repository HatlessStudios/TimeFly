package calendar;

/*/
Within a CalendarView it is expected that the user wishes to see all current tasks within a given timeframe,
either with or without detail. They may also wish to make quick adjustments e.g. sliding a task to a different time
slot. Editing of more specific details should be made within the Timeslot.EditSlot function.
 */

interface CalendarView {

    void showTimePeriod(boolean showDetail, Timeslot[] data);

    void moveActivity();

    Timeslot[] getCalendar(long unixStart, long unixFinish);
}
