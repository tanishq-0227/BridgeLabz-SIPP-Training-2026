public class CarToll extends VehicleToll {
    private static final double TOLL_AMOUNT = 100.0;

    public CarToll(String vehicleNumber, String ownerName) {
        super(vehicleNumber, ownerName);
    }

    @Override
    public double calculateToll() {
        return TOLL_AMOUNT;
    }
}
