package Command;

public class LightingSystem {
    private boolean on = true;
    private int brightness = 100;

    public boolean isOn() {
        return on;
    }

    public int getBrightness() {
        return brightness;
    }

    public void turnOn() {
        on = true;
        System.out.println("Lighting system is on");
    }

    public void turnOff() {
        on = false;
        brightness = 0;
        System.out.println("Lighting system is off");
    }

    public void setBrightness(int brightness) {
        on = true;
        this.brightness = Math.max(0, Math.min(100, brightness));
        System.out.println("Lighting brightness: " + this.brightness + "%");
    }

    public void restore(boolean previousOn, int previousBrightness) {
        on = previousOn;
        brightness = previousBrightness;
        System.out.println("Lighting restored: " + (on ? "on" : "off") + ", " + brightness + "%");
    }
}
