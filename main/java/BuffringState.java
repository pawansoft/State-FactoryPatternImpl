public class BuffringState implements IPlayerState{
    VideoPlayer videoPlayer;

    public BuffringState() {
        this.videoPlayer = videoPlayer;
    }

    @Override
    public void performTask() {
        System.out.println("Buffering State");
    }
}
