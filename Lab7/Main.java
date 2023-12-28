import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        HouseholdChemicalFactory dishwashingSoapFactory = new DishwashingSoapFactory();
        Soap dishwashingSoap = dishwashingSoapFactory.createSoap();
        dishwashingSoap.produce();
        System.out.println();
        HouseholdChemicalFactory bathroomCleanerFactory = new BathroomCleanerFactory();
        BathroomCleaner tileCleaner = bathroomCleanerFactory.createBathroomCleaner();
        tileCleaner.produce();
    }
}