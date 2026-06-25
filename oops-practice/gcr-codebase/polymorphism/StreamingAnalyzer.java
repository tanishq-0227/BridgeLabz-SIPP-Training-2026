public class StreamingAnalyzer {
    public static void searchById(Subscription[] subscriptions, String searchId) {
        System.out.println("\n=== Search by ID ===");
        for (Subscription sub : subscriptions) {
            if (sub.getSubscriptionId().equals(searchId)) {
                System.out.println("Found: " + sub.getSubscriberName() + " - Charge: $" + sub.calculateMonthlyCharge());
                return;
            }
        }
        System.out.println("Subscription not found!");
    }

    public static void displayByNamePrefix(Subscription[] subscriptions, char prefix) {
        System.out.println("\n=== Subscribers starting with " + prefix + " ===");
        for (Subscription sub : subscriptions) {
            if (sub.getSubscriberName().charAt(0) == prefix) {
                System.out.println(sub.getSubscriberName() + " - $" + sub.calculateMonthlyCharge());
            }
        }
    }

    public static double calculateTotalRevenue(Subscription[] subscriptions) {
        double total = 0;
        for (Subscription sub : subscriptions) {
            total += sub.calculateMonthlyCharge();
        }
        return total;
    }

    public static void findMostExpensive(Subscription[] subscriptions) {
        System.out.println("\n=== Most Expensive Plan ===");
        Subscription expensive = subscriptions[0];
        for (Subscription sub : subscriptions) {
            if (sub.calculateMonthlyCharge() > expensive.calculateMonthlyCharge()) {
                expensive = sub;
            }
        }
        System.out.println(expensive.getSubscriberName() + " - $" + expensive.calculateMonthlyCharge());
    }
}
