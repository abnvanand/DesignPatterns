package creational.factorymethod.simple2.factory;

import creational.factorymethod.simple2.buttons.Button;
import creational.factorymethod.simple2.buttons.HTMLButton;

public class HTMLDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HTMLButton();
    }
}
