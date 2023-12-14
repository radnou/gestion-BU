package rmoss.gestionBibliotheque.controller;

import rmoss.gestionBibliotheque.model.Bibliotheque;
import rmoss.gestionBibliotheque.model.Book;
import rmoss.gestionBibliotheque.model.Magazine;
import rmoss.gestionBibliotheque.model.Media;

public class BibliothequeController {
    private final Bibliotheque bibliotheque;

    public BibliothequeController(Bibliotheque bibliotheque) {
        this.bibliotheque = bibliotheque;
    }

    public void addMedia (Media media) throws Exception {
        if (media.getClass().equals(Book.class)) {
            bibliotheque.addBook((Book) media);
        } else if (media.getClass().equals(Magazine.class)) {
            bibliotheque.addMagazine((Magazine) media);
        } else {
            throw new Exception("Type de media non pris en charge " + media.getClass());
        }

    }
}
