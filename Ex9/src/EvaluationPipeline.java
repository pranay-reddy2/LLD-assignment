public class EvaluationPipeline {

    private final PlagiarismService plagiarismService;
    private final GradingService gradingService;
    private final ReportService reportService;

    public EvaluationPipeline(PlagiarismService plagiarismService,
                              GradingService gradingService,
                              ReportService reportService) {

        this.plagiarismService = plagiarismService;
        this.gradingService = gradingService;
        this.reportService = reportService;
    }

    public void evaluate(Submission submission) {

        System.out.println("=== Evaluation Pipeline ===");

        int plagiarismScore = plagiarismService.check(submission);
        System.out.println("PlagiarismScore=" + plagiarismScore);

        int codeScore = gradingService.grade(submission);
        System.out.println("CodeScore=" + codeScore);

        String reportName = "report-" + submission.roll + ".txt";
        reportService.write(reportName);

        int total = plagiarismScore + codeScore;
        String result = total >= 50 ? "PASS" : "FAIL";

        System.out.println("FINAL: " + result + " (total=" + total + ")");
    }
}