public class Main {
    public static void main(String[] args) {
        MilitaryUnitFactory infantryFactory = new InfantryFactory();
        MilitaryUnit infantryUnit = infantryFactory.createMilitaryUnit();
        displayUnitInformation(infantryUnit);

        MilitaryUnitFactory cavalryFactory = new CavalryFactory();
        MilitaryUnit cavalryUnit = cavalryFactory.createMilitaryUnit();
        displayUnitInformation(cavalryUnit);

        MilitaryUnitFactory artilleryFactory = new ArtilleryFactory();
        MilitaryUnit artilleryUnit = artilleryFactory.createMilitaryUnit();
        displayUnitInformation(artilleryUnit);
    }

    private static void displayUnitInformation(MilitaryUnit unit) {
        System.out.println("Тип війська: " + unit.getUnitType());
        System.out.println("Опис: " + unit.getDescription());
        System.out.println();
    }
}