public class ShippedOrder extends Order {
    private String trackingNumber;

    public ShippedOrder(int orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    public String getOrderStatus() {
        return "Order Status: Shipped, Tracking: " + trackingNumber;
    }

    public String getTrackingNumber() {
        return trackingNumber;
    }
}
