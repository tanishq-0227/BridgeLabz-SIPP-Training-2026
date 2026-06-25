public interface GroceryDelivery {
    void deliverGrocery(String customer);

    default void trackOrder() {
        System.out.println("Tracking grocery order status...");
    }
}
