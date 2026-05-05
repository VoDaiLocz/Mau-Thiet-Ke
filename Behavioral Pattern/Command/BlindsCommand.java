package Command;

public class BlindsCommand implements Command {
    private final Blinds blinds;
    private final int position;
    private int previousPosition;

    public BlindsCommand(Blinds blinds, int position) {
        this.blinds = blinds;
        this.position = position;
    }

    @Override
    public void execute() {
        previousPosition = blinds.getPosition();
        if (position == 0) {
            blinds.lower();
        } else if (position == 100) {
            blinds.raise();
        } else {
            blinds.stopAt(position);
        }
    }

    @Override
    public void undo() {
        blinds.restore(previousPosition);
    }

    @Override
    public String getName() {
        return "Set blinds to " + position + "%";
    }
}
