package behavioural.state;

import behavioural.state.ui.Player;
import behavioural.state.ui.UI;

public class Demo {
    public static void main(String[] args) {
        UI ui = new UI(new Player());
        ui.init();
    }
}
