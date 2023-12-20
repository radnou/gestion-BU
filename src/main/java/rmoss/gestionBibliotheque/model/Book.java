package rmoss.gestionBibliotheque.model;

import java.util.Date;

public class Book extends Media {
    private String ISBN;
    private int pageCount;
    private String genre;
    private String publisher;

    public Book(String mediaId, String title, String author, Date parutionDate, String type, String ISBN) {
        super(mediaId, title, author, parutionDate, type);
        this.ISBN = ISBN;
    }

    public Book(Book book1) {
        super(book1.getMediaId(), book1.getTitle(), book1.getAuthor(), book1.getParutionDate(), book1.getType());
        this.genre = book1.getGenre();
        this.ISBN = book1.getISBN();
        this.publisher = book1.getPublisher();
    }


    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }


}
