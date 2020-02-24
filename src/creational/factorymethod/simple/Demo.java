package creational.factorymethod.simple;

public class Demo {
    private static Logistics logistics;

    public static void main(String[] args) {
        double roadCost = 100, waterCost = 10;
        if (roadCost < waterCost)
            logistics = new RoadLogistics();
        else
            logistics = new SeaLogistics();

        logistics.planDelivery();
    }
}
