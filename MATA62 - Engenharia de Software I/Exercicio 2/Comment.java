import java.util.Date;

public class Comment {
    private String text;
    private Date creationDate;
    private User author;

    public Comment(){};

    public Comment(String text, Date creationDate, User author) {
        this.text = text;
        this.creationDate = creationDate;
        this.author = author;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }
}
