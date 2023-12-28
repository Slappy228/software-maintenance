public class ArtilleryFactory extends MilitaryUnitFactory { // Фабрика для створення артилерії
    @Override
    MilitaryUnit createMilitaryUnit() {
        return new Artillery();
    }
}