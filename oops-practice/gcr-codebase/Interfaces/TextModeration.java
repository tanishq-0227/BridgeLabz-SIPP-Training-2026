public interface TextModeration {
    boolean isOffensive(String post);

    default void displayModerationPolicy() {
        System.out.println("Text Moderation Policy: No offensive language allowed.");
    }
}
