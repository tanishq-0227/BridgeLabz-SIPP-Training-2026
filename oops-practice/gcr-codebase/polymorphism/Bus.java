public class Bus extends Vehicle {
    private static final double FUEL_PRICE_PER_KM = 3.0;

    public Bus() {
        super("Bus");
    }

    @Override
    public double fuelCost(int km) {
        return km * FUEL_PRICE_PER_KM;
    }
}
