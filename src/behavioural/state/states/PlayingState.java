package behavioural.state.states;

import behavioural.state.ui.Player;

public class PlayingState extends State {
    PlayingState(Player player) {
        super(player);
    }

    @Override
    public String onStop() {
        player.changeState(new StoppedState(player));
        player.setCurrentTrackAfterStop();
        return "Stop playing";
    }

    @Override
    public String onPlay() {
        player.changeState(new PausedState(player));
        String action = player.startPlayback();
        return action;
    }

    @Override
    public String onNext() {
        return player.nextTrack();
    }

    @Override
    public String onPrevious() {
        return player.previousTrack();
    }

    @Override
    public String getText() {
        return "Playing ";
    }
}
