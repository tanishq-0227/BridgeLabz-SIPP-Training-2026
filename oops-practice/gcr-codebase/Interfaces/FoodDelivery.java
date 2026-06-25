public interface FoodDelivery {
    void deliverFood(String customer);

    default void trackOrder() {
        System.out.println("Tracking food order status...");
    }

    static String generateDeliveryCode() {
        return "FD" + System.currentTimeMillis() % 10000;
    }
}
