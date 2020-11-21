public class Driver {
    public static void main(String[] args) {
        VideoPlayer videoPlayer = new VideoPlayer();
        videoPlayer.handleState(State.BUFFERING_STATE);
    }
}
