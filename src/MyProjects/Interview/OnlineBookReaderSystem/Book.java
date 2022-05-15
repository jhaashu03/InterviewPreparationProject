package MyProjects.Interview.OnlineBookReaderSystem;

public class Book {
    private int bookId;
    private String title;
    private String details;
    private boolean isAvailable = false;


    public Book(int bookId, String title, String details) {
        this.bookId = bookId;
        this.title = title;
        this.details = details;
        isAvailable = true;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
