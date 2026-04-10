public class Main {

    void main() {
        AlarmClockRadio clock = new AlarmClockRadio(8, 0, 0, true, 8, 5, true);

        clock.setStation(1060,false);
        clock.radioOn();

        System.out.println("Time: " + clock.showTime());
        System.out.println("Radio is playing " + clock.showStation());
        System.out.println("Alarm set for: " + clock.showAlarmTime());

        System.out.println("---");

        // Loop 5 minutes
        loop(clock, 5);
        System.out.println("---");

        clock.snooze();
        // Loop 9 minutes
        loop(clock, 9);

        System.out.println("---");

        clock.alarmOff();


    }

    static void loop(AlarmClockRadio clock, int min) {
        // Loop min minutes
        for (int i = 0; i < min; i++) {
            for (int j = 0; j < 60; j++) {
                clock.tick();
            }
            System.out.println("Time: " + clock.showTime());
            clock.checkAlarm();

        }
    }
}