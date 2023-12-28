public class DailyReport extends Report { // Конкретна реалізація звіту для щоденного звіту
    private String currentDate;
    private String lastNameFirstName;
    private String comment;

    public DailyReport(ReportSaver reportSaver, String currentDate, String lastNameFirstName, String comment) {
        super(reportSaver);
        this.currentDate = currentDate;
        this.lastNameFirstName = lastNameFirstName;
        this.comment = comment;
    }

    @Override
    public String generateReport() {
        return "Щоденний звіт:\nДата: " + currentDate + "\nПризвіще Ім'я: " + lastNameFirstName + "\nКоментар: " + comment;
    }
}