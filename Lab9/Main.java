import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {
        // Створення об'єкта піци з використанням патерну Побудовник
        Pizza pizza = new Pizza.PizzaBuilder()
                .setBase("Тонке тісто")
                .setTopping("Салямі, гриби, сир")
                .setBaked(true)
                .setPacked(true)
                .setCost(15.99)
                .build();

        // Виведення кроків приготування піци у файл
        writeStepsToFile("steps.txt", pizza);

        // Обчислення та виведення вартості піци
        System.out.println("Вартість піци: $" + pizza.getCost());
    }

    private static void writeStepsToFile(String filename, Pizza pizza) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
            writer.println("Кроки приготування піци:");
            writer.println("1. Вибрати основу: " + pizza.getBase());
            writer.println("2. Додати начинку: " + pizza.getTopping());
            writer.println("3. Випікання: " + (pizza.isBaked() ? "Так" : "Ні"));
            writer.println("4. Пакування: " + (pizza.isPacked() ? "Так" : "Ні"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}