package rmoss.gestionbu.model;

import java.util.Date;

public class Magazine extends Media{
    private String number;
    private String periodicity;

    /**
     *
     * @param title
     * @param author
     * @param parutionDate
     * @param type
     * @param number
     * @param periodicity
     */
    public Magazine(String title, String author, Date parutionDate, String type, String number, String periodicity) {
        super(title, author, parutionDate, type);
        this.number = number;
        this.periodicity = periodicity;
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
}
