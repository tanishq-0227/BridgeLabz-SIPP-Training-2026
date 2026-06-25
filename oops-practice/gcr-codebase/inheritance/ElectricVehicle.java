public class ElectricVehicle extends Vehicle {
    private double batteryCapacity;

    public ElectricVehicle(double maxSpeed, String model, double batteryCapacity) {
        super(maxSpeed, model);
        this.batteryCapacity = batteryCapacity;
    }

    public void charge() {
        System.out.println("Charging electric vehicle...");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }
}
