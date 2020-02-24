package creational.factorymethod.simple;

import creational.factorymethod.simple.transport.Transport;
import creational.factorymethod.simple.transport.Truck;

public class RoadLogistics extends Logistics {
    @Override
    public Transport createTransport() {
        return new Truck();
    }
}
