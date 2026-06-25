public abstract class Subscription {
    protected String subscriberName;
    protected String subscriptionId;

    public Subscription(String subscriberName, String subscriptionId) {
        this.subscriberName = subscriberName;
        this.subscriptionId = subscriptionId;
    }

    public abstract double calculateMonthlyCharge();

    public String getSubscriberName() {
        return subscriberName;
    }

    public String getSubscriptionId() {
        return subscriptionId;
    }
}
