package interfaces;

public class ProjectAssessment implements Assessment {
    private double projectGrade;

    public ProjectAssessment(double projectGrade) {
        this.projectGrade = projectGrade;
    }

    @Override
    public double calcGrade() {
        return projectGrade;
    }
}
