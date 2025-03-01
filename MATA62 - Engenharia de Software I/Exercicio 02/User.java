public class User {
    private String name;
    private String email;
    private String password;
    private Blog[] blogs;

    public User(){}

    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Blog[] getBlogs() {
        return blogs;
    }

    public void setBlogs(Blog[] blogs) {
        this.blogs = blogs;
    }
}
