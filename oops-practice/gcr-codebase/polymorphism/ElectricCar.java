public class ElectricCar extends Vehicle {
    private static final double CHARGE_COST_PER_KM = 1.5;

    public ElectricCar() {
        super("ElectricCar");
    }

    @Override
    public double fuelCost(int km) {
        return km * CHARGE_COST_PER_KM;
    }
}
