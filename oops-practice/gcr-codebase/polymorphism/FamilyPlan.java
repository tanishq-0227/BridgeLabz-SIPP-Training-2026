public class FamilyPlan extends Subscription {
    private static final double MONTHLY_CHARGE = 19.99;

    public FamilyPlan(String subscriberName, String subscriptionId) {
        super(subscriberName, subscriptionId);
    }

    @Override
    public double calculateMonthlyCharge() {
        return MONTHLY_CHARGE;
    }
}
