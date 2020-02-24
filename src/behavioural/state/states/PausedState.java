package behavioural.state.states;

import behavioural.state.ui.Player;

public class PausedState extends State {
    public PausedState(Player player) {
        super(player);
    }

    @Override
    public String onStop() {
        player.changeState(new StoppedState(player));
        return "Stopped...";
    }

    @Override
    public String onPlay() {
        player.changeState(new PlayingState(player));
        String action = player.startPlayback();
        return action;
    }

    @Override
    public String onNext() {
        player.nextTrack();
        return "Paused...";
    }

    @Override
    public String onPrevious() {
        player.previousTrack();
        return "Paused...";
    }

    @Override
    public String getText() {
        return "Paused at ";
    }
}
