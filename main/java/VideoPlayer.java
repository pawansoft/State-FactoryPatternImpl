public class VideoPlayer {
    public void handleState(State state){
//        switch(state){
//            case PAUSE_STATE:
//                PauseState pauseState = new PauseState(this);
//                pauseState.performTask();
//                break;
//            case PLAYING_STATE:
//                PlayingState playingState = new PlayingState(this);
//                playingState.performTask();
//                break;
//            case STOPPED_STATE:
//                StoppedState stoppedState = new StoppedState(this);
//                stoppedState.performTask();
//                break;
//            case BUFFERING_STATE:
//                BuffringState buffringState = new BuffringState(this);
//                buffringState.performTask();
//                break;
//        }
    StateFactory.getInstance().getStateObject(state).performTask();
    }
}
