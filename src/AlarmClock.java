public class AlarmClock extends Clock {

    private int alarmHour;
    private int alarmMinute;
    private boolean alarmIsAM;
    private boolean alarmIsOn;

    public AlarmClock(int hour, int minute, int second, boolean isAM, int alarmHour, int alarmMinute, boolean alarmIsAM) {
        super(hour, minute, second, isAM);
        this.setAlarm(alarmHour, alarmMinute, alarmIsAM);
    }

    private boolean checkTime() {
        return getHour() == alarmHour &&
                getMinute() == alarmMinute &&
                getSecond() == 0 &&
                getIsAM() == alarmIsAM;
    }

    public boolean checkAlarm() {
        if(alarmIsOn && checkTime()) {
            System.out.println("Buzz Buzz Buzz");
            return true;
        }
        return false;
    }

    public void snooze() {
        System.out.println("Snooze was pressed");
        alarmMinute += 9;

        if (alarmMinute >= 60) {
            alarmMinute -= 60;
            alarmHour++;
            if (alarmHour == 12) alarmIsAM = !alarmIsAM;
            if (alarmHour > 12) alarmHour = 1;
        }

        alarmIsOn = true;
    }

    public void alarmOff() {
        alarmIsOn = false;
        System.out.println("The alarm was shut off.");
    }

    public void setAlarm(int hour, int minute, boolean alarmIsAM) {
        this.alarmHour = hour;
        this.alarmMinute = minute;
        this.alarmIsAM = alarmIsAM;
        this.alarmIsOn = true;
    }

    public String showAlarmTime() {
        return String.format("%d:%02d %s", alarmHour, alarmMinute, alarmIsAM ? "AM" : "PM");
    }


}
