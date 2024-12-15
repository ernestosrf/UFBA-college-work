package classes;

import java.util.ArrayList;
import java.util.List;

public class OptionalCourse extends Course {
    private String syllabus;
    private List<Course> preRequisites;

    public OptionalCourse(String name, String code, String syllabus) {
        super(name, code);
        this.syllabus = syllabus;
        this.preRequisites = new ArrayList<>(); // Composição: Lista de pré-requisitos como parte de uma disciplina.
    }

    public String getSyllabus() {
        return syllabus;
    }

    public void setSyllabus(String syllabus) {
        this.syllabus = syllabus;
    }

    public void addPreRequisite(Course course) {
        preRequisites.add(course);
    }

    public void addPreRequisite(List<Course> coursesList) {
        preRequisites.addAll(coursesList);
    }

    @Override
    public String showInfos() {
        String preRequisitesNames = preRequisites.isEmpty() ? "Nenhum" : String.join(", ", preRequisites.stream().map(Course::getName).toList());

        return "Disciplina Optativa: " + getName() + " (" + getCode() + ")\nEmenta: " + syllabus + "\nPré-Requisitos: " + preRequisitesNames + "\n";
    }

    @Override
    public String toString() {
        return showInfos();
    }

}
