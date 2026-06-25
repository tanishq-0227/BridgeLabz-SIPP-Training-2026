public class InterfaceDemo {
    public static void main(String[] args) {
        System.out.println("=== 1. FITNESS TRACKER ===");
        FitnessDevice device = new FitnessDevice();
        device.logActivity("Running");
        device.logActivity("Cycling");
        device.generateReport();
        device.sendAlert("Time to drink water!");
        device.resetData();

        System.out.println("\n=== 2. COUPON VALIDATOR ===");
        ShoppingCart cart = new ShoppingCart();
        String[] coupons = {"SAVE50", "INVALID", "WELCOME20", "short", "DISCOUNT30"};
        cart.checkCoupons(coupons);

        System.out.println("\n=== 3. SMART TV ===");
        SmartTV tv = new SmartTV();
        tv.showSubscriptionDetails();
        tv.playMovie("Inception");
        tv.playGame("Fortnite");
        tv.displayAllContent();

        System.out.println("\n=== 4. CONTENT MODERATION ===");
        ContentModerator moderator = new ContentModerator();
        String[] posts = {
            "This is a great product!",
            "I hate this, abuse!!!",
            "Click here now!!!! $$$$",
            "Check this amazing offer"
        };
        moderator.checkPosts(posts);

        System.out.println("\n=== 5. AIRPORT SECURITY ===");
        AirportSecuritySystem airport = new AirportSecuritySystem();
        String[] passports = {"ABC123DEF", "XY1234567", "INVALID", "PQR987XYZ"};
        airport.processPassengers(passports);

        System.out.println("\n=== 6. HEALTH MONITORING ===");
        HealthMonitoringSystem healthSystem = new HealthMonitoringSystem();
        healthSystem.generateHealthReport();

        System.out.println("=== 7. DELIVERY SYSTEM ===");
        DeliveryExecutive delivery = new DeliveryExecutive();
        delivery.processAllDeliveries();
    }
}
