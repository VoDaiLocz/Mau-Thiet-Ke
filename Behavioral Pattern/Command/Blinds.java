package Command;

public class Blinds {
    private int position = 100;

    public int getPosition() {
        return position;
    }

    public void raise() {
        position = 100;
        System.out.println("Blinds are raised to 100%");
    }

    public void lower() {
        position = 0;
        System.out.println("Blinds are lowered to 0%");
    }

    public void stopAt(int position) {
        this.position = Math.max(0, Math.min(100, position));
        System.out.println("Blinds stopped at " + this.position + "%");
    }

    public void restore(int previousPosition) {
        position = previousPosition;
        System.out.println("Blinds restored to " + position + "%");
    }
}
