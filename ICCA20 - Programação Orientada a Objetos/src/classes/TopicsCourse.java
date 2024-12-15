package classes;

public class TopicsCourse extends OptionalCourse {
    private String syllabus;

    public TopicsCourse(String name, String code, String syllabus) {
        super(name, code, syllabus);
    }

    @Override
    public String showInfos() {
        return "Disciplina de Tópicos: " + getName() + " (" + getCode() + ")\nEmenta: " + syllabus + "\n";
    }

    @Override
    public String toString() {
        return showInfos();
    }

}
