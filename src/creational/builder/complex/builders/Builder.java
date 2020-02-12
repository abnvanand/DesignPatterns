package creational.builder.complex.builders;

import creational.builder.complex.cars.Type;
import creational.builder.complex.components.Engine;
import creational.builder.complex.components.GPSNavigator;
import creational.builder.complex.components.Transmission;
import creational.builder.complex.components.TripComputer;

/**
 * Builder interface defines all possible ways to configure a product.
 */
public interface Builder {
    void setType(Type type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
