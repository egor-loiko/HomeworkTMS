package homeWork3;

import java.util.Random;
import java.util.Scanner;

/*
7.Реализуйте алгоритм сортировки пузырьком.
*/
public class Task8 {
    public static void main(String[] args) {
        int arraySize = 0;
        boolean isNumberCaptured;

        do {
            System.out.println("Enter an array size");
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt()) {
                arraySize = scanner.nextInt();
                isNumberCaptured = false;
            } else {
                System.out.println("You entered an invalid value");
                isNumberCaptured = true;
            }
        } while (isNumberCaptured);

        int[] array = new int[arraySize];

        Random random = new Random();

        System.out.println("Initial array:");
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(25);
            System.out.print(array[i] + " ");
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        System.out.println("\nSorted array:");
        for (int element : array) {
            System.out.print(element + " ");
        }
    }
}
