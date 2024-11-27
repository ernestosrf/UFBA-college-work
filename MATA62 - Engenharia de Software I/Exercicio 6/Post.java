import java.util.Date;

public class Post {
    private int id;
    private String title;
    private String text;
    private Date creationDate;
    private Comment[] comments;

    public Post(){};

    public Post(int id, String title, String text, Date creationDate) {
        this.id = id;
        this.title = title;
        this.text = text;
        this.creationDate = creationDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static Post buscarPostPorId(int id, Post[] posts) {
        for (Post post : posts) {
            if (post.getId() == id) {
                return post;
            }
        }
        return null;
    }

    public void criarComentario(String text, Date creationDate, User author) {
        Comment comment = new Comment();
        comment.setText(text);
        comment.setCreationDate(creationDate);
        comment.setAuthor(author);
        Comment[] currentComments = getComments();
        if (currentComments == null) {
            currentComments = new Comment[1];
            currentComments[0] = comment;
        } else {
            Comment[] newComments = new Comment[currentComments.length + 1];
            System.arraycopy(currentComments, 0, newComments, 0, currentComments.length);
            newComments[currentComments.length] = comment;
            currentComments = newComments;
        }
        setComments(currentComments);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public Comment[] getComments() {
        return comments;
    }

    public void setComments(Comment[] comments) {
        this.comments = comments;
    }
}
