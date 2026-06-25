public class DeliveryExecutive implements FoodDelivery, GroceryDelivery {
    private String[] customers = {"Rajesh", "Priya", "Amit", "Neha"};

    @Override
    public void deliverFood(String customer) {
        String code = FoodDelivery.generateDeliveryCode();
        System.out.println("Delivering food to " + customer + " - Code: " + code);
    }

    @Override
    public void deliverGrocery(String customer) {
        String code = FoodDelivery.generateDeliveryCode();
        System.out.println("Delivering grocery to " + customer + " - Code: " + code);
    }

    @Override
    public void trackOrder() {
        System.out.println("Tracking delivery status in real-time...");
    }

    public void processAllDeliveries() {
        System.out.println("=== Delivery Process ===\n");
        
        for (int i = 0; i < customers.length; i++) {
            if (i % 2 == 0) {
                deliverFood(customers[i]);
            } else {
                deliverGrocery(customers[i]);
            }
            trackOrder();
            System.out.println();
        }
    }
}
