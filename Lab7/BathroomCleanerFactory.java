public class BathroomCleanerFactory implements HouseholdChemicalFactory {// Конкретна фабрика для виробництва засобів для чищення ванни
    @Override
    public Soap createSoap() {
        // null, бо цей тип фабрики не виробляє миючі засоби
        return null;
    }

    @Override
    public BathroomCleaner createBathroomCleaner() {
        return new TileCleaner();
    }
}
