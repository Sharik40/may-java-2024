import java.util.Arrays;

public class Book {
    private String title;
    private String[] authors;
    private int pages;
    private String genre;

    public Book(String title, String[] authors, int pages, String genre) {
        this.title = title;
        this.authors = authors;
        this.pages = pages;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String[] getAuthors() {
        return authors;
    }

    public void setAuthors(String[] authors) {
        this.authors = authors;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", authors=" + Arrays.toString(authors) +
                ", pages=" + pages +
                ", genre='" + genre + '\'' +
                '}';
    }
}
