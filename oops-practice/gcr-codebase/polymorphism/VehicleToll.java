public abstract class VehicleToll {
    protected String vehicleNumber;
    protected String ownerName;

    public VehicleToll(String vehicleNumber, String ownerName) {
        this.vehicleNumber = vehicleNumber;
        this.ownerName = ownerName;
    }

    public abstract double calculateToll();

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }
}
