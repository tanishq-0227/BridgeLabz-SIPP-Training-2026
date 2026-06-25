public class BusToll extends VehicleToll {
    private static final double TOLL_AMOUNT = 200.0;

    public BusToll(String vehicleNumber, String ownerName) {
        super(vehicleNumber, ownerName);
    }

    @Override
    public double calculateToll() {
        return TOLL_AMOUNT;
    }
}
