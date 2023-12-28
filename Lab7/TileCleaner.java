public class TileCleaner  implements BathroomCleaner{ // Конкретний продукт засобу для чищення ванни
    @Override
    public void produce() {
        System.out.println("Вироблено засіб для чищення плитки у ванній");
    }
}
