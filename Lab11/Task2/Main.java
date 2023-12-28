import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the width of the rectangle: ");
        int width = scanner.nextInt();

        System.out.print("Enter the height of the rectangle: ");
        int height = scanner.nextInt();

        Rectangle rectangle = new Rectangle(width, height);
        System.out.print("Rectangle:\n");
        rectangle.draw('-');
        System.out.print("Do you want to change the line type? (yes/no): ");
        char lineType='-';
        String changeLineType = scanner.next();

        if (changeLineType.equalsIgnoreCase("yes")) {
            System.out.print("Enter the line type of the rectangle: ");
            lineType = scanner.next().charAt(0);
            rectangle = new LineTypeDecorator(rectangle, lineType);
            rectangle.draw(lineType);
        }

        System.out.print("Do you want to add color? (yes/no): ");
        String addColor = scanner.next();

        if (addColor.equalsIgnoreCase("yes")) {
            System.out.print("Colors:"+"\n1.Red" +"\n2.Blue"+"\n3.Yellow\n");
            System.out.print("Enter the number of the color: ");
            Integer number = scanner.nextInt();
            switch (number) {
                case 1:
                    rectangle = new ColorDecorator(rectangle, "red");
                    rectangle.draw(lineType,"\u001B[31m");
                    break;
                case 2:
                    rectangle = new ColorDecorator(rectangle, "blue");
                    rectangle.draw(lineType,"\u001B[34m");
                    break;
                case 3:
                    rectangle = new ColorDecorator(rectangle, "yellow");
                    rectangle.draw(lineType,"\u001B[33m");
                    break;
                default:
                    System.out.println("Input error");
                    break;
            }

        }



    }
    }
