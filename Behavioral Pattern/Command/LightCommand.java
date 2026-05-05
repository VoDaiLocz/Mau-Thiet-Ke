package Command;

public class LightCommand implements Command {
    private final LightingSystem lightingSystem;
    private final int brightness;
    private boolean previousOn;
    private int previousBrightness;

    public LightCommand(LightingSystem lightingSystem, int brightness) {
        this.lightingSystem = lightingSystem;
        this.brightness = brightness;
    }

    @Override
    public void execute() {
        previousOn = lightingSystem.isOn();
        previousBrightness = lightingSystem.getBrightness();
        if (brightness == 0) {
            lightingSystem.turnOff();
        } else {
            lightingSystem.setBrightness(brightness);
        }
    }

    @Override
    public void undo() {
        lightingSystem.restore(previousOn, previousBrightness);
    }

    @Override
    public String getName() {
        return "Set light to " + brightness + "%";
    }
}
