public class InfantryFactory extends MilitaryUnitFactory {// Фабрика для створення піхоти
    @Override
    MilitaryUnit createMilitaryUnit() {
        return new Infantry();
    }
}