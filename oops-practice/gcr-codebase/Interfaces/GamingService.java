public interface GamingService {
    void playGame(String gameName);

    default void showSubscriptionDetails() {
        System.out.println("Gaming Subscription: Elite $14.99/month");
    }
}
