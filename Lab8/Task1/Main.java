public class Main {
    public static void main(String[] args) {
        HouseholdChemicalFactory householdChemicalFactory1 =  HouseholdChemicalFactorySingleton.getInstance();
        Soap dishwashingSoap = householdChemicalFactory1.createSoap();
        dishwashingSoap.produce();
        try {
            HouseholdChemicalFactory householdChemicalFactory2 = HouseholdChemicalFactorySingleton.getInstance();
        } catch (IllegalStateException e) {
            System.out.println("Помилка: " + e.getMessage());
        }

    }
}