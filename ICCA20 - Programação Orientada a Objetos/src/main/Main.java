package main;

import classes.*;
import classes.Class;

import java.util.ArrayList;
import java.util.List;

import static constants.Constants.*;


public class Main {
    public static void main(String[] args) {
        // criando 3 disciplinas obrigatorias, 2 optativas e 2 disciplinas de topicos
        MandatoryCourse mata40 = new MandatoryCourse(MATA40_NAME, MATA40_CODE, MATA40_SYLLABUS);
        OptionalCourse mata55 = new OptionalCourse(MATA55_NAME, MATA55_CODE, MATA55_SYLLABUS);
        mata55.addPreRequisite(mata40); // adicionando mata40 como pre-requisito de mata55
        MandatoryCourse mata37 = new MandatoryCourse(MATA37_NAME, MATA37_CODE, MATA37_SYLLABUS);
        MandatoryCourse mata57 = new MandatoryCourse(MATA57_NAME, MATA57_CODE, MATA57_SYLLABUS);
        OptionalCourse mata49 = new OptionalCourse(MATA49_NAME, MATA49_CODE, MATA49_SYLLABUS);
        List<Course> courses = new ArrayList<>();
        courses.add(mata37);
        courses.add(mata57);
        mata49.addPreRequisite(courses); // adicionando uma lista de disciplinas (mata37 e mata57) como pre-requisitos de mata49
        TopicsCourse mate85 = new TopicsCourse(MATE85_NAME, MATE85_CODE, MATE85_SYLLABUS);
        TopicsCourse mate77 = new TopicsCourse(MATE77_NAME, MATE77_CODE, MATE77_SYLLABUS);

        // criando professores
        Professor antonio = new Professor(ANTONIO);
        Professor cassio = new Professor(CASSIO);
        Professor rubisley = new Professor(RUBISLEY);
        Professor babacar = new Professor(BABACAR);
        Professor fred = new Professor(FRED);
        Professor ivan = new Professor(IVAN);

        // criando as turmas para cada disciplina e associando professores
        Class mata40Class = new Class(mata40, antonio);
        Class mata55Class = new Class(mata55, cassio);
        Class mata37Class = new Class(mata37, rubisley);
        Class mata57Class = new Class(mata57, cassio);
        Class mata49Class = new Class(mata49, babacar);
        Class mate85Class = new Class(mate85, fred);
        Class mate77Class = new Class(mate77, ivan);

        // criando alunos
        Student ernesto = new Student(ERNESTO);
        Student anderson = new Student(ANDERSON);
        Student eliel = new Student(ELIEL);
        Student rodrigo = new Student(RODRIGO);
        Student gustavo = new Student(GUSTAVO);
        Student denise = new Student(DENISE);
        Student matheus = new Student(MATHEUS);
        Student juliana = new Student(JULIANA);

        // inscrevendo alunos em turmas
        mata57Class.addStudent(ernesto); // adicionando individualmente
        mata57Class.addStudent(anderson); // adicionando individualmente
        List<Student> students = new ArrayList<>();
        students.add(eliel);
        students.add(rodrigo);
        students.add(gustavo);
        mata57Class.addStudent(students); // adicionando varios de uma vez

        mata49Class.addStudent(juliana);
        mata49Class.addStudent(matheus);
        mata49Class.addStudent(denise);

        // gerando relatorio das disciplinas
        Report<Course> courseReport = new Report<>();
        courseReport.addItem(mata57);
        courseReport.addItem(mata49);

        System.out.println("Relatório de Disciplinas:");
        courseReport.showReport();

        // gerando relatorio das turmas
        Report<Class> classReport = new Report<>();
        classReport.addItem(mata57Class);
        classReport.addItem(mata49Class);
        classReport.addItem(mata37Class);

        System.out.println("Relatório de Turmas:");
        classReport.showReport();
    }
}