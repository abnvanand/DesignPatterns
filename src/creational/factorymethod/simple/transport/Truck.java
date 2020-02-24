package creational.factorymethod.simple.transport;

public class Truck implements Transport {
    @Override
    public void deliver() {
        System.out.println("Deliver via roadways");
    }
}
