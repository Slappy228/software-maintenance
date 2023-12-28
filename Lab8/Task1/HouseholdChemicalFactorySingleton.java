public class HouseholdChemicalFactorySingleton {

    private static HouseholdChemicalFactory instance;

    private HouseholdChemicalFactorySingleton() {
        if (instance != null) {
            throw new IllegalStateException("Єдиний екземпляр вже існує. Використовуйте getInstance() для отримання екземпляру.");
        }
    }

    public static HouseholdChemicalFactory getInstance() {
        if (instance == null) {
            instance = new DishwashingSoapFactory(); // Можна вибрати будь-яку фабрику за замовчуванням
        } else {
            throw new IllegalStateException("Спроба створити другий екземпляр сінглтона.");
        }
        return instance;
    }
}