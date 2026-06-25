public class Book {
    private String title;
    private int publicationYear;

    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    public void displayInfo() {
        System.out.println("Title: " + title + ", Publication Year: " + publicationYear);
    }

    public String getTitle() {
        return title;
    }

    public int getPublicationYear() {
        return publicationYear;
    }
}
