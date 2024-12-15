package classes;

public class MandatoryCourse extends Course {
    private String syllabus;

    public MandatoryCourse(String name, String code, String syllabus) {
        super(name, code); // Chamada ao construtor da classe base.
        this.syllabus = syllabus;
    }

    public String getSyllabus() {
        return syllabus;
    }

    public void setSyllabus(String syllabus) {
        this.syllabus = syllabus;
    }

    @Override
    public String showInfos() {
        // Sobrescrita de metodo
        return "Disciplina Obrigatória: " + getName() + " (" + getCode() + ")\nEmenta: " + syllabus + "\n";
    }

    @Override
    public String toString() {
        return showInfos();
    }

}
