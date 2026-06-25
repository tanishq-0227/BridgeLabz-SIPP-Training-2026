public class PremiumPlan extends Subscription {
    private static final double MONTHLY_CHARGE = 12.99;

    public PremiumPlan(String subscriberName, String subscriptionId) {
        super(subscriberName, subscriptionId);
    }

    @Override
    public double calculateMonthlyCharge() {
        return MONTHLY_CHARGE;
    }
}
