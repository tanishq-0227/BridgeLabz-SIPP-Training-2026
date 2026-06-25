public abstract class Vehicle {
    protected String vehicleType;

    public Vehicle(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public abstract double fuelCost(int km);

    public String getVehicleType() {
        return vehicleType;
    }
}
