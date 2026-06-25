public class BasicPlan extends Subscription {
    private static final double MONTHLY_CHARGE = 5.99;

    public BasicPlan(String subscriberName, String subscriptionId) {
        super(subscriberName, subscriptionId);
    }

    @Override
    public double calculateMonthlyCharge() {
        return MONTHLY_CHARGE;
    }
}
