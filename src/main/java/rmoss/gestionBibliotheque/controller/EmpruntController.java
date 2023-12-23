package rmoss.gestionBibliotheque.controller;

import rmoss.gestionBibliotheque.model.Emprunt;
import rmoss.gestionBibliotheque.model.Media;
import rmoss.gestionBibliotheque.model.User;

import java.util.HashSet;
import java.util.Optional;

public class EmpruntController {
    private final HashSet<Emprunt> emprunts;

    public EmpruntController(HashSet<Emprunt> emprunts) {
        this.emprunts = emprunts;
    }


    private void createEmprunt(User user, Media media) {
        //check if the media is available
        Optional<Emprunt> empruntOptional = emprunts.stream()
                .filter(emprunt -> emprunt.getMedia().getMediaId().equals(media.getMediaId()))
                .findFirst();

        if (!empruntOptional.isPresent()) {
            Emprunt newEmprunt = new Emprunt(user, media);
            newEmprunt.setEmpruntId(user.getId());
            newEmprunt.setMedia(media);

            emprunts.add(newEmprunt);
        }


    }
}
