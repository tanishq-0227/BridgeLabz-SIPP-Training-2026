public class TruckToll extends VehicleToll {
    private static final double TOLL_AMOUNT = 300.0;

    public TruckToll(String vehicleNumber, String ownerName) {
        super(vehicleNumber, ownerName);
    }

    @Override
    public double calculateToll() {
        return TOLL_AMOUNT;
    }
}
