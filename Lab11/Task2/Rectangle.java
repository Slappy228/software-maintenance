public class Rectangle { // Базовий клас "Прямокутник"
        int width;
        int height;
        public static final String resetColor = "\u001B[0m";//для повернення стандартного кольору тексту
        public Rectangle(int width, int height) {
              this.width = width;
              this.height = height;
        }
         public void draw(char symbol) {
             for (int i = 0; i < height; i++) {
              for (int j = 0; j < width; j++) {
                     System.out.print(symbol);
                 }
                  System.out.println();
             }
        }
        public void draw(char symbol, final String color) {
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    System.out.print(color+symbol +resetColor);
                }
                System.out.println();
            }
        }
}
