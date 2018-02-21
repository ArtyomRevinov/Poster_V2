package kz.epam.entity;

/**
 * @author Artyom Revinov
 */
public class Poster {

    private int id;
    private String title;
    private String description;
    private String release;
    private String producer;
    private String honorar;
    private String picture;
    private String trailer;
    private String comment;


    public Poster() {}

    public String getComment() {return comment;}

    public void setComment(String comment) {this.comment = comment;}

    public String getTrailer() {
        return trailer;
    }

    public void setTrailer(String trailer) {
        this.trailer = trailer;
    }

    public String getPicture() {return picture;}

    public void setPicture(String picture) {this.picture = picture;}

    public int getId() {return id;}

    public void setId(int id) {this.id = id;}

    public String getTitle() {return title;}

    public void setTitle(String title) {this.title = title;}

    public String getDescription() {return description;}

    public void setDescription(String description) {this.description = description;}

    public String getRelease() {return release;}

    public void setRelease(String release) {this.release = release;}

    public String getProducer() {return producer;}

    public void setProducer(String producer) {this.producer = producer;}

    public String getHonorar() {return honorar;}

    public void setHonorar(String honorar) {this.honorar = honorar;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Poster poster = (Poster) o;

        if (id != poster.id) return false;
        if (title != null ? !title.equals(poster.title) : poster.title != null) return false;
        if (description != null ? !description.equals(poster.description) : poster.description != null) return false;
        if (release != null ? !release.equals(poster.release) : poster.release != null) return false;
        if (producer != null ? !producer.equals(poster.producer) : poster.producer != null) return false;
        return honorar != null ? honorar.equals(poster.honorar) : poster.honorar == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (release != null ? release.hashCode() : 0);
        result = 31 * result + (producer != null ? producer.hashCode() : 0);
        result = 31 * result + (honorar != null ? honorar.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Poster{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", release='" + release + '\'' +
                ", producer='" + producer + '\'' +
                ", honorar='" + honorar + '\'' +
                '}';
    }
}
