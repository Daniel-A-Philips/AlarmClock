public class AlarmClock extends Clock {

    private int alarmHour;
    private int alarmMinute;
    private boolean alarmIsAM;
    private boolean alarmIsOn;

    public AlarmClock(int hour, int minute, int second, boolean isAM, int alarmHour, int alarmMinute, boolean alarmIsAM) {
        super(hour, minute, second, isAM);
        this.alarmHour = alarmHour;
        this.alarmMinute = alarmMinute;
        this.alarmIsAM = alarmIsAM;
        this.alarmIsOn = true;
    }
}
