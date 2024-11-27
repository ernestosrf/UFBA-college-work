import java.util.Date;

public class SistemaBlog {
    private User[] users;
    private Blog[] blogs;

    public SistemaBlog(){}

    public SistemaBlog(User[] users, Blog[] blogs) {
        this.users = users;
        this.blogs = blogs;
    }

    public User[] getUsers() {
        return users;
    }

    public void setUsers(User[] users) {
        this.users = users;
    }

    public Blog[] getBlogs() {
        return blogs;
    }

    public void setBlogs(Blog[] blogs) {
        this.blogs = blogs;
    }

    public void criarNota(String texto, int idBlog){
        Blog[] localBlogs = getBlogs();
        Blog blog = Blog.buscarBlogPorId(idBlog, localBlogs);
        blog.criarNovaNota(texto);
    }

    public Post[] obterTextosNotas(int idBlog){
        Blog[] localBlogs = getBlogs();
        Blog blog = Blog.buscarBlogPorId(idBlog, localBlogs);
        return blog.getPosts();
    }

    public void criarComentario(String texto, Date dataCriacao, int idBlog, int idPost, User autor){
        Blog[] localBlogs = getBlogs();
        Blog blog = Blog.buscarBlogPorId(idBlog, localBlogs);
        Post[] posts = blog.getPosts();
        Post post = Post.buscarPostPorId(idPost, posts);
        post.criarComentario(texto, dataCriacao, autor);
    }
}
