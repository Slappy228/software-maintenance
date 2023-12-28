public class LineTypeDecorator extends Rectangle {// Декоратор для зміни типу лінії прямокутника
    private char lineType;

    public LineTypeDecorator(Rectangle rectangle, char lineType) {
        super(rectangle.width, rectangle.height);
        this.lineType = lineType;
    }

    @Override
    public void draw(char lineType) {
        System.out.println("Drawing a rectangle with " + lineType + " lines:");
        super.draw(lineType);
    }
}
