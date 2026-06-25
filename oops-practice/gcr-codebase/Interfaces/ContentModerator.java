public class ContentModerator implements TextModeration, SpamDetection {
    private String[] restrictedWords = {"hate", "abuse", "violence"};
    private String[] spamPatterns = {"$$$$", "click here", "buy now"};

    @Override
    public boolean isOffensive(String post) {
        for (String word : restrictedWords) {
            if (post.toLowerCase().contains(word)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean isSpam(String post) {
        for (String pattern : spamPatterns) {
            if (post.toLowerCase().contains(pattern)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void displayModerationPolicy() {
        System.out.println("Content Moderation Policy: No offensive language and no spam allowed.");
    }

    public void moderatePost(String post) {
        System.out.println("\nPost: \"" + post + "\"");
        
        if (SpamDetection.containsRestrictedWords(post)) {
            System.out.println("Status: CONTAINS RESTRICTED WORDS");
        } else if (isSpam(post)) {
            System.out.println("Status: SPAM");
        } else if (isOffensive(post)) {
            System.out.println("Status: OFFENSIVE");
        } else {
            System.out.println("Status: VALID");
        }
    }

    public void checkPosts(String[] posts) {
        displayModerationPolicy();
        for (String post : posts) {
            moderatePost(post);
        }
    }
}
