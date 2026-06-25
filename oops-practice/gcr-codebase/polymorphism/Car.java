public class Car extends Vehicle {
    private static final double FUEL_PRICE_PER_KM = 5.0;

    public Car() {
        super("Car");
    }

    @Override
    public double fuelCost(int km) {
        return km * FUEL_PRICE_PER_KM;
    }
}
