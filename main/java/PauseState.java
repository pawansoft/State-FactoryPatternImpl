public class PauseState implements IPlayerState{
    VideoPlayer videoPlayer;

    public PauseState() {
        this.videoPlayer = videoPlayer;
    }

    @Override
    public void performTask() {
        System.out.println("PauseState");
    }
}
