public class AlarmClockRadio {
    private AlarmClock alarmClock;
    private Radio radio;

    public AlarmClockRadio(int hour, int minute, int second, boolean isAM,
                           int alarmHour, int alarmMinute, boolean alarmIsAM) {
        alarmClock = new AlarmClock(hour, minute, second, isAM, alarmHour, alarmMinute, alarmIsAM);
        radio = new Radio();
    }

    public void tick() { alarmClock.tick(); }

    public String showTime() { return alarmClock.showTime(); }

    public void setTime(int hour, int minute, int second, boolean isAM) {
        alarmClock.setTime(hour, minute, second, isAM);
    }

    public boolean checkAlarm() { return alarmClock.checkAlarm(); }
}
