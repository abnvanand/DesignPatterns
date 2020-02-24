package creational.factorymethod.simple2;

import creational.factorymethod.simple2.factory.Dialog;
import creational.factorymethod.simple2.factory.HTMLDialog;
import creational.factorymethod.simple2.factory.WindowsDialog;

public class Demo {
    private static Dialog dialog;

    public static void main(String[] args) {
        // Choose the concrete factory to use
        if (System.getProperty("os.name").equalsIgnoreCase("Linux"))
            dialog = new WindowsDialog();
        else
            dialog = new HTMLDialog();

        dialog.renderWindow();
    }
}
