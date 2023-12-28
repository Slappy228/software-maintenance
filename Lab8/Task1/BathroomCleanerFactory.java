public class BathroomCleanerFactory implements HouseholdChemicalFactory {
    @Override
    public Soap createSoap() {
        // null, бо цей тип фабрики не виробляє миючі засоби
        return null;
    }

    @Override
    public BathroomCleaner createBathroomCleaner() {
        return new TileCleaner(); // Замість повертання null
    }
}
