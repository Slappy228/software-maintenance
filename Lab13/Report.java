public abstract class Report {// Абстракція для формування звіту
    protected ReportSaver reportSaver;

    public Report(ReportSaver reportSaver) {
        this.reportSaver = reportSaver;
    }

    public abstract String generateReport();

    public void saveReport(String filename) {
        String content = generateReport();
        reportSaver.save(filename, content);
    }
}