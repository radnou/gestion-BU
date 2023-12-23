package rmoss.gestionBibliotheque.model;

import java.util.Date;

public class Media {


    private String mediaId;
    private String title;
    private String author;
    private Date parutionDate;
    private String type;

    /**
     * @param title
     * @param author
     * @param parutionDate
     * @param type
     */
    public Media(String mediaId, String title, String author, Date parutionDate, String type) {
        this.mediaId = mediaId;
        this.title = title;
        this.author = author;
        this.parutionDate = parutionDate;
        this.type = type;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getParutionDate() {
        return parutionDate;
    }

    public void setParutionDate(Date parutionDate) {
        this.parutionDate = parutionDate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMediaId() {
        return mediaId;
    }

    public void setMediaId(String mediaId) {
        this.mediaId = mediaId;
    }

    @Override
    public String toString() {
        return "Media{" +
                "mediaId='" + mediaId + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", parutionDate=" + parutionDate +
                ", type='" + type + '\'' +
                '}';
    }
}
