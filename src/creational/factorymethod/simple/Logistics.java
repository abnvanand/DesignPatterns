package creational.factorymethod.simple;

import creational.factorymethod.simple.transport.Transport;

public abstract class Logistics {
    public abstract Transport createTransport();

    void planDelivery() {
        System.out.println("Planning delivery");
        Transport transport = createTransport();
        transport.deliver();
        System.out.println("Delivered!!!");
    }
}
