public class PlayingState implements IPlayerState {
    VideoPlayer videoPlayer;

    public PlayingState() {
        this.videoPlayer = videoPlayer;
    }

    @Override
    public void performTask() {
        System.out.println("Playing State");
    }
}
