package homeWork4;

import java.util.Random;
import java.util.Scanner;

/*4. Создайте двумерный массив целых чисел. Выведите на консоль сумму всех элементов массива.
 */
public class Task4 {
    public static void main(String[] args) {
        int numberOfRows = 0;
        int numberOfColumns = 0;
        boolean isNumberCaptured;
        int sum = 0;

        do {
            System.out.println("Enter number of rows");
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt()) {
                numberOfRows = scanner.nextInt();
                isNumberCaptured = false;
            } else {
                System.out.println("You entered an invalid value");
                isNumberCaptured = true;
            }
        } while (isNumberCaptured);

        do {
            System.out.println("Enter number of columns");
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt()) {
                numberOfColumns = scanner.nextInt();
                isNumberCaptured = false;
            } else {
                System.out.println("You entered an invalid value");
                isNumberCaptured = true;
            }
        } while (isNumberCaptured);

        int[][] array = new int[numberOfRows][numberOfColumns];

        Random random = new Random();

        System.out.println("Array: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(20);
                System.out.print(array[i][j] + " ");
                sum += array[i][j];
            }
            System.out.println();
        }
        System.out.println("\nSum of array elements: " + sum);

    }
}
