package behavioural.state.states;

import behavioural.state.ui.Player;

public class StoppedState extends State {
    StoppedState(Player player) {
        super(player);
        player.setPlaying(false);
    }

    @Override
    public String onStop() {
        if (player.isPlaying()) {
            player.changeState(new PausedState(player));
            return "Stop playing";
        } else
            return "Locked...";
    }

    @Override
    public String onPlay() {
        player.changeState(new PausedState(player));
        return "Ready";
    }

    @Override
    public String onNext() {
        return "Stopped...";
    }

    @Override
    public String onPrevious() {
        return "Stopped...";
    }

    @Override
    public String getText() {
        return "Stopped...";
    }
}
