package rmoss.gestionBibliotheque.model;

import java.util.Date;
import java.util.Objects;

public class Magazine extends Media {
    private final String genre;
    private final int pageCount;
    private String number;
    private String periodicity;

    public Magazine(String mediaId, String title, String author, Date parutionDate, String type, String number, String periodicity, String genre, int pageCount) {
        super(mediaId, title, author, parutionDate, type);
        this.number = number;
        this.periodicity = periodicity;
        this.genre = genre;
        this.pageCount = pageCount;
    }

    public String getGenre() {
        return genre;
    }

    public int getPageCount() {
        return pageCount;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getPeriodicity() {
        return periodicity;
    }

    public void setPeriodicity(String periodicity) {
        this.periodicity = periodicity;
    }

    @Override
    public String toString() {
        return super.toString() + "Magazine{" +
                "number='" + number + '\'' +
                ", periodicity='" + periodicity + '\'' +
                ", genre='" + genre + '\'' +
                ", pageCount=" + pageCount +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Magazine magazine = (Magazine) o;
        return getPageCount() == magazine.getPageCount() && Objects.equals(getNumber(), magazine.getNumber()) && Objects.equals(getPeriodicity(), magazine.getPeriodicity()) && Objects.equals(getGenre(), magazine.getGenre());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNumber(), getPeriodicity(), getGenre(), getPageCount());
    }
}
