package classes;

import java.util.ArrayList;
import java.util.List;

// Composição
public class Class {
    private Course course;
    private Professor professor;
    private List<Student> students;

    public Class(Course course, Professor professor) {
        this.course = course;
        this.professor = professor;
        this.students = new ArrayList<>();
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    // Sobrecarga de metodos: Permite adicionar um unico aluno ou uma lista de alunos
    public void addStudent(Student student) {
        students.add(student);
    }

    public void addStudent(List<Student> studentsList) {
        students.addAll(studentsList);
    }

    public List<Student> getStudents() {
        return students;
    }

    public String showInfos() {
        String studentsNames = students.isEmpty() ? "Nenhum" : String.join(", ", students.stream().map(Student::getName).toList());

        return "Turma da disciplina: " + course.getName() + "\nProfessor: " + professor.getName() + "\nAlunos inscritos: " + studentsNames + "\n";
    }

    @Override
    public String toString() {
        return showInfos();
    }
}
