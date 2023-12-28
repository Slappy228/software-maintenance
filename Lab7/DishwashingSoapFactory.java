public class DishwashingSoapFactory implements HouseholdChemicalFactory{ // Конкретна фабрика для виробництва миючих засобів
    @Override
    public Soap createSoap() {
        return new DishwashingSoap();
    }

    @Override
    public BathroomCleaner createBathroomCleaner() {
        // и null, бо цей тип фабрики не виробляє засоби для чищення ванни
        return null;
    }
}
