package rmoss.gestionBibliotheque.model;

import java.util.Date;

public class Emprunt {
    private User emprunteur;
    private Media media;
    private Date dateEmprunt;
    private Date dateRetourPrevu;

    private Date dateRetourreel;

    private boolean retard;

}
