package rmoss.gestionBibliotheque.controller;

import rmoss.gestionBibliotheque.model.Bibliotheque;
import rmoss.gestionBibliotheque.model.Book;
import rmoss.gestionBibliotheque.model.Magazine;
import rmoss.gestionBibliotheque.model.Media;

import java.util.Optional;

public class MediaController {
    private final Bibliotheque bibliotheque;

    public MediaController(Bibliotheque bibliotheque) {
        this.bibliotheque = bibliotheque;
    }

    public void addMedia(Media media) throws Exception {
        if (media.getClass().equals(Book.class)) {
            bibliotheque.addBook((Book) media);
        } else if (media.getClass().equals(Magazine.class)) {
            bibliotheque.addMagazine((Magazine) media);
        } else {
            throw new Exception("Type de media non pris en charge " + media.getClass());
        }

    }

    public Media searchMedia(String mediaId) throws Exception {

        Optional<Book> book = bibliotheque.getBooks().stream()
                .filter(b -> b.getMediaId().equals(mediaId)).findFirst();

        Optional<Magazine> magazine = bibliotheque.getMagazines().stream()
                .filter(b -> b.getMediaId().equals(mediaId)).findFirst();


        if (book.isPresent()) {
            return book.get();
        } else if (magazine.isPresent()) {
            return magazine.get();
        } else {
            throw new Exception("Type de media non pris en charge " + mediaId);
        }
    }
}
