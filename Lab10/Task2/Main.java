import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Створення прототипів
        MilitaryUnit infantryPrototype = new Infantry();
        MilitaryUnit cavalryPrototype = new Cavalry();
        MilitaryUnit artilleryPrototype = new Artillery();

        try {
            // Клонування прототипів для створення нових військових відділів
            MilitaryUnit newInfantry = (MilitaryUnit) infantryPrototype.clone();
            MilitaryUnit newCavalry = (MilitaryUnit) cavalryPrototype.clone();
            MilitaryUnit newArtillery = (MilitaryUnit) artilleryPrototype.clone();

            // Виведення інформації про нові військові відділи
            System.out.println("--------------------------------------");
            displayUnitInformation(newInfantry);
            displayUnitInformation(newCavalry);
            displayUnitInformation(newArtillery);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

    private static void displayUnitInformation(MilitaryUnit unit) {
        System.out.println("Тип війська: " + unit.getUnitType());
        System.out.println("Опис: " + unit.getDescription());
        System.out.println("---------------------------------------");
    }
}