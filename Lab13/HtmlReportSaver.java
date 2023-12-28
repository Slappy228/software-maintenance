import java.io.FileWriter;
import java.io.IOException;

public class HtmlReportSaver implements ReportSaver {// Конкретна реалізація для html формату
    @Override
    public void save(String filename, String content) {
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write(content);
            System.out.println("Збережено у html форматі: " + filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
