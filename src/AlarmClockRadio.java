public class AlarmClockRadio {
    private final AlarmClock alarmClock;
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

    public boolean checkAlarm() {
        if(alarmClock.getAlarmIsOn() && alarmClock.checkTime()) {
            System.out.println("The radio is playing " + radio.showStation());
            return true;
        }
        return false;
    }

    public void snooze() { alarmClock.snooze(); }
    public void alarmOff() { alarmClock.alarmOff(); }
    public void setAlarm(int hour, int minute, boolean isAM) {
        alarmClock.setAlarm(hour, minute, isAM);
    }

    public String showAlarmTime() { return alarmClock.showAlarmTime(); }

    public void radioOn() { radio.turnOn(); }
    public void radioOff() { radio.turnOff(); }

    public void setStation(int station, boolean isFM) {
        radio.setStation(station, isFM);
    }

    public void setVolume(int vol) { radio.setVolume(vol); }

    public String showStation() { return radio.showStation(); }

    public boolean isRadioOn() { return radio.isOn(); }
}
