package rmoss.gestionBibliotheque.model;

import java.util.HashSet;

public class Bibliotheque {

    private String bibliothequeId;
    private String bibliothequeName;

    private HashSet<Book> books = new HashSet<>();
    private HashSet<Magazine> magazines = new HashSet<>();
    private HashSet<User> users = new HashSet<>();

    public Bibliotheque() {
    }


    public HashSet<User> getUsers() {
        return users;
    }

    public void setUsers(HashSet<User> users) {
        this.users = users;
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

    public String getBibliothequeId() {
        return bibliothequeId;
    }

    public void setBibliothequeId(String bibliothequeId) {
        this.bibliothequeId = bibliothequeId;
    }

    public String getBibliothequeName() {
        return bibliothequeName;
    }

    public void setBibliothequeName(String bibliothequeName) {
        this.bibliothequeName = bibliothequeName;
    }

    public int getTotalMediaCount() {
        return books.size() + magazines.size();
    }

    public boolean isMediaAvailable(String mediaId) {
        return true;
    }

    @Override
    public String toString() {
        return "Bibliotheque{" +
                "bibliothequeId='" + bibliothequeId + '\'' +
                ", bibliothequeName='" + bibliothequeName + '\'' +
                ", books=" + books +
                ", magazines=" + magazines +
                ", users=" + users +
                '}';
    }
}
