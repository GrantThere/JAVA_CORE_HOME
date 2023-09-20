package HW_1;

import java.util.Arrays;

public class Book {
    /// title
    // pages
    // [String] Authors  "John Doe"
    // genre

    private String title;
    private int pages;
    private String[] authors;
    private String genre;

    public Book(String title, int pages, String[] authors, String genre) {
        this.title = title;
        this.pages = pages;
        this.authors = authors;
        this.genre = genre;
    }

    /// GETTERS
        public String getTitle() {
            return title;
        }

        public int getPages() {
            return pages;
        }

        public String[] getAuthors() {
            return authors;
        }

        public  String getGenre() {
            return genre;
        }

    /// SETTERS
        public void setTitle(String title) {
            this.title  = title;
        }

        public void setPages(int pages) {
            this.pages = pages;
        }

        public void setAuthors(String[] authors) {
            this.authors = authors;
        }

        public void setGenre(String genre) {
            this.genre = genre;
        }

        @Override
    public String toString() {
        return title+ "|" + pages+ "|" + Arrays.toString(authors)+ "|" + genre;
        }
}
