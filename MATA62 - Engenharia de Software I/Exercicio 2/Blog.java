import java.util.Date;

public class Blog {
    private String title;
    private Post[] posts;
    private Date creationDate;
    private User owner;

    public Blog() {}

    public Blog(String title, Date creationDate, User owner) {
        this.title = title;
        this.creationDate = creationDate;
        this.owner = owner;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public Post[] getPosts() {
        return posts;
    }

    public void setPosts(Post[] posts) {
        this.posts = posts;
    }
}
