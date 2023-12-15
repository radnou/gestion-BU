package rmoss.gestionBibliotheque;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import rmoss.gestionBibliotheque.model.Bibliotheque;
import rmoss.gestionBibliotheque.model.Book;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

@TestMethodOrder(MethodOrderer.MethodName.class)

public class GestionBibliothequeModelTest {

    private static final Bibliotheque bibliotheque = new Bibliotheque();
    private static Book book1;

    @BeforeAll
    public static void initTest() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        try {
            book1 = new Book(
                    "1984",
                    "George Orwell",
                    sdf.parse("1949-06-08"),
                    "Dystopian",
                    "978-0451524935"
            );

        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void shouldAddBookToBibliotheque() throws ParseException {

        assertTrue(bibliotheque.addBook(book1));

    }

    @Test
    public void shouldGetBookByIsbnFromBibliotheque() throws Exception {
        Book bookResult = bibliotheque.getBookFromISBN(book1.getISBN());
        assertEquals(bookResult.getISBN(), book1.getISBN());
    }

    @Test
    public void shouldNotGetBookByIsbnFromBibliotheque() throws Exception {

        Exception exception = assertThrows(Exception.class, () -> {
            bibliotheque.getBookFromISBN("ISBNThatNotExists");
        });
        assertTrue(exception.getMessage().contains("he book with isbn ISBNThatNotExists is not found"));

    }

    @Test
    public void shouldUpdateBook() throws Exception {
        book1.setType("realism");
        book1.setTitle("World");
        book1.setAuthor("toto");
        bibliotheque.updateBook(book1);
        Book book2 = bibliotheque.getBookFromISBN(book1.getISBN());
        assertEquals(book2.getType(), book1.getType());
        assertEquals(book2.getAuthor(), book1.getAuthor());
        assertEquals(book2.getTitle(), book1.getTitle());

    }

}
