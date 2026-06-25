public class SmartTV implements StreamingService, GamingService {
    private String[] movies = {"Inception", "Interstellar", "Avatar", "Titanic"};
    private String[] games = {"Fortnite", "Elden Ring", "FIFA 24", "Minecraft"};

    @Override
    public void playMovie(String movieName) {
        System.out.println("Playing Movie: " + movieName);
    }

    @Override
    public void playGame(String gameName) {
        System.out.println("Playing Game: " + gameName);
    }

    @Override
    public void showSubscriptionDetails() {
        System.out.println("SmartTV Bundle Subscription: $19.99/month (Streaming + Gaming)");
    }

    public void displayAllContent() {
        System.out.println("\n=== Available Movies ===");
        for (String movie : movies) {
            System.out.println("- " + movie);
        }
        System.out.println("\n=== Available Games ===");
        for (String game : games) {
            System.out.println("- " + game);
        }
    }
}
