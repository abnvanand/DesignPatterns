package creational.factorymethod.simple.transport;

public class Ship implements Transport {
    @Override
    public void deliver() {
        System.out.println("Deliver via waterways");
    }
}
