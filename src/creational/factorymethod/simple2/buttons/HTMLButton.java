package creational.factorymethod.simple2.buttons;

public class HTMLButton implements Button {
    @Override
    public void render() {
        System.out.println("<button> Test Button </button>");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Click button says - Hello World");
    }
}
