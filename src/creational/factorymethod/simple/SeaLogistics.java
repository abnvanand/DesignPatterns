package creational.factorymethod.simple;

import creational.factorymethod.simple.transport.Ship;
import creational.factorymethod.simple.transport.Transport;

public class SeaLogistics extends Logistics {
    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
