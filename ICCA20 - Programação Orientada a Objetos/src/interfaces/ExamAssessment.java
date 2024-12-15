package interfaces;

import java.util.List;

public class ExamAssessment implements Assessment {
    private List<Double> examGrades;

    public ExamAssessment(List<Double> examGrades) {
        this.examGrades = examGrades;
    }

    @Override
    public double calcGrade() {
        return examGrades.stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
    }
}
