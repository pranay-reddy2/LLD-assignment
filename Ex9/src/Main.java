public class Main {

    public static void main(String[] args) {

        Submission submission =
                new Submission("23BCS1007", "public class A {}", "A.java");

        PlagiarismService plagiarism = new PlagiarismChecker();
        GradingService grading = new CodeGrader(new Rubric());
        ReportService writer = new ReportWriter();

        EvaluationPipeline pipeline =
                new EvaluationPipeline(plagiarism, grading, writer);

        pipeline.evaluate(submission);
    }
}