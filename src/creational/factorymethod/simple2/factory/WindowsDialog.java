package creational.factorymethod.simple2.factory;

import creational.factorymethod.simple2.buttons.Button;
import creational.factorymethod.simple2.buttons.WindowsButton;

public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
