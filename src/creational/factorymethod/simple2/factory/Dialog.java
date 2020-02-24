package creational.factorymethod.simple2.factory;

import creational.factorymethod.simple2.buttons.Button;

public abstract class Dialog {
    public void renderWindow() {
        System.out.println("Rendering your window");
        // Same business logic irrespective of the kind of button
        Button okButton = createButton();
        okButton.render();
    }

    // delegate responsibility of object creation to subclasses
    public abstract Button createButton();
}
