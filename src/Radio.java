public class Radio {
    private int station;
    private boolean isFM;
    private int volume;
    private boolean isOn;

    public Radio() {
        this.station = 880;
        this.isFM = false;
        this.volume = 5;
        this.isOn = false;
    }

    public void turnOn() { this.isOn = true; }
    public void turnOff() { this.isOn = false; }

    public void setStation(int station, boolean isFM) {
        this.station = station;
        this.isFM = isFM;
    }

    public void setVolume(int volume) {
        if (volume >= 0 && volume <= 10) this.volume = volume;
    }

    public boolean isOn() { return isOn; }
    public int getVolume() { return volume; }

    public String showStation() {
        return station + " " + (isFM ? "FM" : "AM");
    }
}
