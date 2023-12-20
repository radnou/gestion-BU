package rmoss.gestionBibliotheque.model;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Emprunt {
    private String empruntId;
    private User emprunteur;
    private Media media;
    private Date dateEmprunt;
    private Date dateRetourPrevu;

    private Date dateRetourreel;

    private boolean retard;

    public Emprunt(String empruntId, User emprunteur, Media media, Date dateEmprunt) {
        this.empruntId = empruntId;
        this.emprunteur = emprunteur;
        this.media = media;
        this.dateEmprunt = dateEmprunt;
    }

    public String getEmpruntId() {
        return empruntId;
    }

    public void setEmpruntId(String empruntId) {
        this.empruntId = empruntId;
    }

    public User getEmprunteur() {
        return emprunteur;
    }

    public void setEmprunteur(User emprunteur) {
        this.emprunteur = emprunteur;
    }

    public Media getMedia() {
        return media;
    }

    public void setMedia(Media media) {
        this.media = media;
    }

    public Date getDateEmprunt() {
        return dateEmprunt;
    }

    public void setDateEmprunt(Date dateEmprunt) {
        this.dateEmprunt = dateEmprunt;
    }

    public Date getDateRetourPrevu() {
        return dateRetourPrevu;
    }

    public void setDateRetourPrevu(Date dateRetourPrevu) {
        this.dateRetourPrevu = dateRetourPrevu;
    }

    public Date getDateRetourreel() {
        return dateRetourreel;
    }

    public void setDateRetourreel(Date dateRetourreel) {
        this.dateRetourreel = dateRetourreel;
    }

    public boolean isRetard() {
        return retard;
    }

    public void setRetard(boolean retard) {
        this.retard = retard;
    }

    public long getLoanDuration() {
        long diffInMillis = Math.abs(dateRetourPrevu.getTime() - dateEmprunt.getTime());
        long diffInDays = TimeUnit.DAYS.convert(diffInMillis, TimeUnit.MILLISECONDS);
        return diffInDays;
    }

    public boolean isOverdue() {
        return Date.from(this.dateRetourPrevu.toInstant()).after(new Date());
    }


    @Override
    public String toString() {
        return "Emprunt{" +
                "empruntId='" + empruntId + '\'' +
                ", emprunteur=" + emprunteur +
                ", media=" + media +
                ", dateEmprunt=" + dateEmprunt +
                ", dateRetourPrevu=" + dateRetourPrevu +
                ", dateRetourreel=" + dateRetourreel +
                ", retard=" + retard +
                '}';
    }
}
