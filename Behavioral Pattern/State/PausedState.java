package State;

public class PausedState implements State {
    @Override
    public void play(MediaPlayer mediaPlayer) {
        System.out.println("Play media");
        mediaPlayer.setState(new PlayingState());
        mediaPlayer.setIcon("pause");
    }

    @Override
    public void pause(MediaPlayer mediaPlayer) {
        System.out.println("Media is already paused");
    }
}
