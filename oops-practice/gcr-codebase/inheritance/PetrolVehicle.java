public class PetrolVehicle extends Vehicle implements Refuelable {
    private double fuelTankCapacity;

    public PetrolVehicle(double maxSpeed, String model, double fuelTankCapacity) {
        super(maxSpeed, model);
        this.fuelTankCapacity = fuelTankCapacity;
    }

    @Override
    public void refuel() {
        System.out.println("Refueling petrol vehicle...");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Fuel Tank Capacity: " + fuelTankCapacity + " liters");
    }

    public double getFuelTankCapacity() {
        return fuelTankCapacity;
    }
}
