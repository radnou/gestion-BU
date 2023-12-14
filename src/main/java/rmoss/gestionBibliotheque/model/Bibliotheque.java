package rmoss.gestionBibliotheque.model;

import java.util.HashSet;

public class Bibliotheque {
    private HashSet<Book> books= new HashSet<>();
    private HashSet<Magazine> magazines = new HashSet<>();

    public Bibliotheque() {
    }

    public HashSet<Book> getBooks() {
        return books;
    }

    public void setBooks(HashSet<Book> books) {
        this.books = books;
    }

    public HashSet<Magazine> getMagazines() {
        return magazines;
    }

    public void setMagazines(HashSet<Magazine> magazines) {
        this.magazines = magazines;
    }

    @Override
    public String toString() {
        return "Bibliotheque{" +
                "books=" + books +
                ", magazines=" + magazines +
                '}';
    }
}
