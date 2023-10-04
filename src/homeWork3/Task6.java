package homeWork3;

/*
5. Создайте массив и заполните массив. Выведите массив на экран в строку.
Замените каждый элемент с нечётным индексом на ноль. Снова выведете массив на
экран на отдельной строке.
*/

import java.util.Random;
import java.util.Scanner;

public class Task6 {
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

        System.out.println("\nModified array:");
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                array[i] = 0;
            }
            System.out.print(array[i] + " ");
        }
    }
}
