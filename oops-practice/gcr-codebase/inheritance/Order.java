public class Order {
    private int orderId;
    private String orderDate;

    public Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    public String getOrderStatus() {
        return "Order Status: Placed";
    }

    public int getOrderId() {
        return orderId;
    }

    public String getOrderDate() {
        return orderDate;
    }
}
