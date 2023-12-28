import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Введення даних для щоденного звіту
        System.out.print("Введіть дату для щоденного звіту: ");
        String dailyDate = scanner.nextLine();
        System.out.print("Введіть призвіще ім'я для щоденного звіту: ");
        String dailyName = scanner.nextLine();
        System.out.print("Введіть коментар для щоденного звіту: ");
        String dailyComment = scanner.nextLine();

        // Введення даних для тижневого звіту
        System.out.print("Введіть дати за тиждень для тижневого звіту: ");
        String weeklyDates = scanner.nextLine();
        System.out.print("Введіть призвіще ім'я для тижневого звіту: ");
        String weeklyName = scanner.nextLine();
        System.out.print("Введіть коментар для тижневого звіту: ");
        String weeklyComment = scanner.nextLine();

        ReportSaver textReportSaver = new TextReportSaver();
        ReportSaver htmlReportSaver = new HtmlReportSaver();
        // Створення щоденного та тижневого звітів з введеними даними
        Report dailyReport = new DailyReport(textReportSaver, dailyDate, dailyName, dailyComment);
        Report weeklyReport = new WeeklyReport(htmlReportSaver, weeklyDates, weeklyName, weeklyComment);
        // Збереження звітів
        dailyReport.saveReport("щоденний_звіт.txt");
        weeklyReport.saveReport("тижневий_звіт.html");
        scanner.close();
    }
}


