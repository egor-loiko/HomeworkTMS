package homeWork7.Task1;

public class FigureDemo {
    public static void main(String[] args) {

        double perimeterSum = 0;
        Figure[] array = {
                new Triangle(4, 6, 3),
                new Rectangle(8, 5),
                new Circle(4),
                new Triangle(9, 8, 3),
                new Circle(91)

        };

        for (Figure element : array) {
            System.out.println("Figure name = " + element.getClass().getSimpleName());
            System.out.println("Perimeter = " + element.perimeter());
            System.out.println("Square = " + element.square());
            System.out.println("_________________________");
            perimeterSum += element.perimeter();
        }

        System.out.println("Sum of perimeters of all figures is equal : " + perimeterSum);
    }
}
