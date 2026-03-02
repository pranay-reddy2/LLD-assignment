public class ReportWriter implements ReportService {

    @Override
    public void write(String fileName) {
        System.out.println("Report written: " + fileName);
    }
}