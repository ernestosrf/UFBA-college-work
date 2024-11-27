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
        Blog[] blogs = getBlogs();
        Blog blog = Blog.buscarBlogPorId(idBlog, blogs);
        blog.criarNovaNota(texto);
    }
}
