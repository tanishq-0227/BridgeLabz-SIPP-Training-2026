public interface StreamingService {
    void playMovie(String movieName);

    default void showSubscriptionDetails() {
        System.out.println("Streaming Subscription: Premium $9.99/month");
    }
}
