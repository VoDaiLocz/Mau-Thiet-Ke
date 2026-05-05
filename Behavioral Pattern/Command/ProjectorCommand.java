package Command;

public class ProjectorCommand implements Command {
    private final Projector projector;
    private final ProjectorMode mode;
    private ProjectorMode previousMode;

    public ProjectorCommand(Projector projector, ProjectorMode mode) {
        this.projector = projector;
        this.mode = mode;
    }

    @Override
    public void execute() {
        previousMode = projector.getMode();
        if (mode == ProjectorMode.WORK) {
            projector.workMode();
        } else if (mode == ProjectorMode.MOVIE) {
            projector.movieMode();
        } else {
            projector.turnOff();
        }
    }

    @Override
    public void undo() {
        projector.restore(previousMode);
    }

    @Override
    public String getName() {
        return "Set projector to " + mode;
    }
}
