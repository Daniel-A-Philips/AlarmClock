public class Clock {
    private int hour;
    private int minute;
    private int second;
    private boolean isAM;

    public Clock(int hour, int minute, int second, boolean isAM) {
        this.setTime(hour, minute, second, isAM);
    }

    public void tick() {
        second++;
        if (second >= 60) {
            second = 0;
            minute++;
            if (minute >= 60) {
                minute = 0;
                hour++;
                if (hour == 12) isAM = !isAM;
                if (hour > 12) hour = 1;
            }
        }
    }

    public String showTime() {
        return String.format("%d:%02d %s", hour, minute, isAM ? "AM" : "PM");
    }

    public int getHour() { return hour; }
    public int getMinute() { return minute; }
    public int getSecond() { return second; }
    public boolean getIsAM() { return isAM; }

    public void setTime(int hour, int minute, int second, boolean isAM) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        this.isAM = isAM;
    }
}

