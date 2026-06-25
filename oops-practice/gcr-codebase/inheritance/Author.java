public class Author extends Book {
    private String authorName;
    private String bio;

    public Author(String title, int publicationYear, String authorName, String bio) {
        super(title, publicationYear);
        this.authorName = authorName;
        this.bio = bio;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Author: " + authorName + ", Bio: " + bio);
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getBio() {
        return bio;
    }
}
