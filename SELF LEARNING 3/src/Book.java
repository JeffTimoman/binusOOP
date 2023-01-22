
public class Book {
    private String title;
    private String author;
    private int pages;
    private int id;
    private String genre;
    private boolean isAvailable = true;

    public Book(int id, String title, String author, String genre, int pages) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.genre = genre;
    }

    public Book(){

    }
    
    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return this.pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isIsAvailable() {
        return this.isAvailable;
    }

    public boolean getIsAvailable() {
        return this.isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public String getGenre() {
        return this.genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "{" +
            " title='" + getTitle() + "'" +
            ", author='" + getAuthor() + "'" +
            ", pages='" + getPages() + "'" +
            ", id='" + getId() + "'" +
            ", genre='" + getGenre() + "'" +
            ", isAvailable='" + isIsAvailable() + "'" +
            "}";
    }
    
    
}
