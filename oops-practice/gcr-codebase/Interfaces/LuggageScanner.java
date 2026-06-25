public interface LuggageScanner {
    void scanLuggage(String passportNo);

    default void displaySecurityGuidelines() {
        System.out.println("Luggage Security: Scan all bags for prohibited items.");
    }
}
