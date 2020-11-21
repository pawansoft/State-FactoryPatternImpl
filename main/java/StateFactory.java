public class StateFactory {
    static StateFactory instance;

    public static StateFactory getInstance(){
        if(instance == null){
            instance = new StateFactory();
        }
        return instance;
    }
    private StateFactory() {
    }


    public IPlayerState getStateObject(State state) {
        switch (state) {
            case BUFFERING_STATE:
                return new BuffringState();
            case STOPPED_STATE:
                return new StoppedState();
            case PLAYING_STATE:
                return new PlayingState();
            case PAUSE_STATE:
                return new PauseState();
        }
        return null;
    }
}
