package behavioural.state.states;

import behavioural.state.ui.Player;

public abstract class State {
    Player player;

    State(Player player) {
        this.player = player;
    }

    public abstract String onStop();

    public abstract String onPlay();

    public abstract String onNext();

    public abstract String onPrevious();

    public abstract String getText();
}
