public class CodeGrader implements GradingService {

    private final Rubric rubric;

    public CodeGrader(Rubric rubric) {
        this.rubric = rubric;
    }

    @Override
    public int grade(Submission submission) {
        return 78;
    }
}