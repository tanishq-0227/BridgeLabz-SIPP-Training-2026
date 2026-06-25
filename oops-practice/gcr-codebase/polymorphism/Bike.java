public class Bike extends Vehicle {
    private static final double FUEL_PRICE_PER_KM = 2.5;

    public Bike() {
        super("Bike");
    }

    @Override
    public double fuelCost(int km) {
        return km * FUEL_PRICE_PER_KM;
    }
}
