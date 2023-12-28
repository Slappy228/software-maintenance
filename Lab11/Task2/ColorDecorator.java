public class ColorDecorator extends Rectangle {// Декоратор для зміни кольору прямокутника
    private String nameColor;

    public ColorDecorator(Rectangle rectangle, String nameColor) {
        super(rectangle.width, rectangle.height);
        this.nameColor = nameColor;
    }

    @Override
    public void draw(char symbol,String color) {
        System.out.println("Drawing a " + nameColor + " rectangle:");
        super.draw(symbol,color);
    }
}