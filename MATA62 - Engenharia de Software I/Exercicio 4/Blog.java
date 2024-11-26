import java.util.Date;

public class Blog {
    private int id;
    private String title;
    private Post[] posts;
    private Date creationDate;
    private User owner;

    public Blog() {}

    public Blog(int id, String title, Date creationDate, User owner) {
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
        Post[] posts = getPosts();
        if (posts == null) {
            posts = new Post[1];
            posts[0] = post;
        } else {
            Post[] newPosts = new Post[posts.length + 1];
            for (int i = 0; i < posts.length; i++) {
                newPosts[i] = posts[i];
            }
            newPosts[posts.length] = post;
            posts = newPosts;
        }
        setPosts(posts);
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
