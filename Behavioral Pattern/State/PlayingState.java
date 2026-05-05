package State;

public class PlayingState implements State {
    @Override
    public void play(MediaPlayer mediaPlayer) {
        System.out.println("Media is already playing");
    }

    @Override
    public void pause(MediaPlayer mediaPlayer) {
        System.out.println("Pause media");
        mediaPlayer.setState(new PausedState());
        mediaPlayer.setIcon("play");
    }
}
