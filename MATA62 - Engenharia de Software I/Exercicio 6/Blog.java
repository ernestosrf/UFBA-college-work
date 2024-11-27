import java.util.Date;

public class Blog {
    private int id;
    private String title;
    private Post[] posts;
    private Date creationDate;
    private User owner;

    public Blog() {}

    public Blog(int id, String title, Date creationDate, User owner) {
        this.id = id;
        this.title = title;
        this.creationDate = creationDate;
        this.owner = owner;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static Blog buscarBlogPorId(int id, Blog[] blogs) {
        for (Blog blog : blogs) {
            if (blog.getId() == id) {
                return blog;
            }
        }
        return null;
    }

    public void criarNovaNota(String texto) {
        Post post = new Post();
        post.setText(texto);
        post.setCreationDate(new Date());
        Post[] currentPosts = getPosts();
        if (currentPosts == null) {
            currentPosts = new Post[1];
            currentPosts[0] = post;
        } else {
            Post[] newPosts = new Post[currentPosts.length + 1];
            System.arraycopy(currentPosts, 0, newPosts, 0, currentPosts.length);
            newPosts[currentPosts.length] = post;
            currentPosts = newPosts;
        }
        setPosts(currentPosts);
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
