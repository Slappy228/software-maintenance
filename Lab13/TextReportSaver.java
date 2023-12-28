import java.io.FileWriter;
import java.io.IOException;

public class TextReportSaver implements ReportSaver {// Конкретна реалізація для текстового формату
    @Override
    public void save(String filename, String content) {
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write(content);
            System.out.println("Збережено у текстовому форматі: " + filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}