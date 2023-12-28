public class CavalryFactory extends MilitaryUnitFactory {// Фабрика для створення кінноти
    @Override
    MilitaryUnit createMilitaryUnit() {
        return new Cavalry();
    }
}