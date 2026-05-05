package Command;

import java.util.Arrays;

public class Client {
    public static void main(String[] args) {
        LightingSystem lightingSystem = new LightingSystem();
        Blinds blinds = new Blinds();
        Projector projector = new Projector();

        Command startMeeting = new MacroCommand("Start meeting", Arrays.asList(
                new BlindsCommand(blinds, 0),
                new LightCommand(lightingSystem, 0),
                new ProjectorCommand(projector, ProjectorMode.WORK)
        ));

        TouchPanel touchPanel = new TouchPanel();
        touchPanel.setCommand("startMeeting", startMeeting);
        touchPanel.setCommand("halfBlinds", new BlindsCommand(blinds, 50));
        touchPanel.setCommand("movieProjector", new ProjectorCommand(projector, ProjectorMode.MOVIE));

        touchPanel.pressButton("halfBlinds");
        System.out.println("-----");
        touchPanel.undo();
        System.out.println("-----");

        touchPanel.pressButton("startMeeting");
        System.out.println("-----");
        touchPanel.undo();
        System.out.println("-----");

        touchPanel.printLog();
    }
}
