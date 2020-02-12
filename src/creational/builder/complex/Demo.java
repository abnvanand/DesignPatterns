package creational.builder.complex;

import creational.builder.complex.builders.CarBuilder;
import creational.builder.complex.builders.CarManualBuilder;
import creational.builder.complex.cars.Car;
import creational.builder.complex.cars.Manual;
import creational.builder.complex.director.Director;

/**
 * Demo class. Everything comes together here.
 */
public class Demo {

    public static void main(String[] args) {
        Director director = new Director();

        // Director gets the concrete builder object from the client
        // (application code). That's because application knows better which
        // builder to use to get a specific product.
        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);

        // The final product is often retrieved from a builder object, since
        // Director is not aware and not dependent on concrete builders and
        // products.
        Car car = builder.build();
        System.out.println("Car built:\n" + car.getType());


        CarManualBuilder manualBuilder = new CarManualBuilder();

        // Director may know several building recipes.
        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.build();
        System.out.println("\nCar manual built:\n" + carManual.print());
    }

}