public class StoppedState implements IPlayerState{
    VideoPlayer videoPlayer;

    public StoppedState() {
        this.videoPlayer = videoPlayer;
    }

    @Override
    public void performTask() {
        System.out.println("Stopped State");
    }
}
