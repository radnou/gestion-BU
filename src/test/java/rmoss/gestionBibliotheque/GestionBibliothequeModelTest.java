package rmoss.gestionBibliotheque;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import rmoss.gestionBibliotheque.model.Bibliotheque;
import rmoss.gestionBibliotheque.model.Book;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import static com.sun.org.apache.xerces.internal.util.PropertyState.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GestionBibliothequeModelTest {

    private final Bibliotheque bibliotheque;
    private Book book1;

    public GestionBibliothequeModelTest(Bibliotheque bibliotheque) {
        this.bibliotheque = bibliotheque;
    }

    @BeforeAll
    private void initTest() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        book1 = new Book(
                "1984",
                "George Orwell",
                sdf.parse("1949-06-08"),
                "Dystopian",
                "978-0451524935"
        );
    }

    @Test
    public void shouldAddBookToBibliotheque() throws ParseException {

        assertTrue(bibliotheque.addBook(book1));

    }

    @Test
    public void shouldGetBookFromBibliotheque() throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        Book bookResult = bibliotheque.getBookFromISBN(book1.getISBN());
        assertThat(bookResult.getISBN(), is(book1.getISBN()).isExceptional());

    }

}
