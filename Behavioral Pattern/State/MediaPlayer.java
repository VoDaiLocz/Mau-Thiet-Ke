package State;

public class MediaPlayer {
    private State state;
    private String icon;

    public MediaPlayer() {
        state = new PausedState();
        icon = "play";
    }

    public void setState(State state) {
        this.state = state;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public void play() {
        state.play(this);
        System.out.println("Icon: " + icon);
    }

    public void pause() {
        state.pause(this);
        System.out.println("Icon: " + icon);
    }
}
