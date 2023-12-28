public class TubCleaner implements BathroomCleaner { // Інший конкретний продукт засобу для чищення ванни
    @Override
    public void produce() {
        System.out.println("Вироблено засіб для чищення ванни");
    }
}
