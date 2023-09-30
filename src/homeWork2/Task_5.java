package homeWork2;

/*
5. По введенному номеру определить цвет радуги (1 –
красный, 4 – зеленый и т. д.).
 */

public class Task_5 {
    public static void main(String[] args) {
        int numberOfColor = 5;

        switch (numberOfColor) {
            case 1:
                System.out.println("Red");
                break;
            case 2:
                System.out.println("Orange");
                break;
            case 3:
                System.out.println("Yellow");
                break;
            case 4:
                System.out.println("Green");
                break;
            case 5:
                System.out.println("Light Blue");
                break;
            case 6:
                System.out.println("Blue");
                break;
            case 7:
                System.out.println("Violet");
                break;
        }
    }
}
