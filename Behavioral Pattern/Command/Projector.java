package Command;

public class Projector {
    private ProjectorMode mode = ProjectorMode.OFF;

    public ProjectorMode getMode() {
        return mode;
    }

    public void workMode() {
        mode = ProjectorMode.WORK;
        System.out.println("Projector is in work mode");
    }

    public void movieMode() {
        mode = ProjectorMode.MOVIE;
        System.out.println("Projector is in movie mode");
    }

    public void turnOff() {
        mode = ProjectorMode.OFF;
        System.out.println("Projector is off");
    }

    public void restore(ProjectorMode previousMode) {
        mode = previousMode;
        System.out.println("Projector restored to " + mode);
    }
}
