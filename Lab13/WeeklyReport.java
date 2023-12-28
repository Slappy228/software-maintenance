public class WeeklyReport extends Report {// Конкретна реалізація звіту для тижневого звіту
    private String currentWeekDates;
    private String lastNameFirstName;
    private String comment;

    public WeeklyReport(ReportSaver reportSaver, String currentWeekDates, String lastNameFirstName, String comment) {
        super(reportSaver);
        this.currentWeekDates = currentWeekDates;
        this.lastNameFirstName = lastNameFirstName;
        this.comment = comment;
    }

    @Override
    public String generateReport() {
        return "Тижневий звіт:\nДата: " + currentWeekDates + "\nПризвіще Ім'я: " + lastNameFirstName + "\nКоментар: " + comment;
    }
}