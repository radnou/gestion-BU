package rmoss.gestionBibliotheque.model;

import java.util.HashSet;

public class Bibliotheque {
    private HashSet<Book> books = new HashSet<>();
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

    public boolean addBook(Book book) {
        return this.books.add(book);
    }

    public boolean addMagazine(Magazine magazine) {
        return this.magazines.add(magazine);
    }

    public Book getBookFromISBN(String isbn) throws Exception {
        for (Book book : books) {
            if (book.getISBN().equals(isbn)) {
                return book;
            }
        }
        throw new Exception(String.valueOf(String.format("the book with isbn %s is not found", isbn)));
    }

    public boolean updateBook(Book book1) throws Exception {
        Book book = getBookFromISBN(book1.getISBN());
        book.setType(book1.getType());
        book.setAuthor(book1.getAuthor());
        book.setTitle(book.getTitle());
        book.setParutionDate(book.getParutionDate());
        return true;

    }

    public boolean removeBook(Book bookToDelete) throws Exception {
        for (Book book : books) {
            if (book.getISBN().equals(bookToDelete.getISBN())) {
                return books.remove(book);
            }
        }
        throw new Exception(String.valueOf(String.format("the book with isbn %s is not found", bookToDelete.toString())));
    }
}
