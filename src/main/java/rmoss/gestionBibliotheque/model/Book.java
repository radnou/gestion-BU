package rmoss.gestionBibliotheque.model;

import java.util.Date;

public class Book extends Media {
    private String ISBN;

    public Book(String title, String author, Date parutionDate, String type, String ISBN) {
        super(title, author, parutionDate, type);
        this.ISBN = ISBN;
    }

//generate lambda function to create ISBN


    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
}