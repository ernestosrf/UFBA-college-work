package classes;

public abstract class Course {
    private String name;
    private String code;

    public Course(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    // Metodo abstrato, utilizado para polimorfismo, o que obriga subclasses a implementarem ele.
    public abstract String showInfos();
}
