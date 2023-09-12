package homeWork4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
6. Создайте двумерный массив целых чисел. Отсортируйте элементы в строках двумерного массива по возрастанию.
 */
public class Task6 {
    public static void main(String[] args) {

        int numberOfRows = 0;
        int numberOfColumns = 0;
        boolean isNumberCaptured;

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

        System.out.println("Initial Array: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(20);
                System.out.print(array[i][j] + " ");

            }
            System.out.println();
        }

//        The first easy option
//        for (int i = 0; i < array.length; i++) {
//            Arrays.sort(array[i]);
//        }

        // The second a bit more complex option
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i].length - 1; k++) {
                    if (array[i][k] > array[i][k + 1]) {
                        int temp = array[i][k];
                        array[i][k] = array[i][k + 1];
                        array[i][k + 1] = temp;
                    }
                }
            }

        }

        System.out.println("\nSorted array:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
