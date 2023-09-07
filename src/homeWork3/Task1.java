package homeWork3;

/*
1. Создайте массив целых чисел. Напишете программу, которая
выводит сообщение о том, входит ли заданное число в массив или нет.
Пусть число для поиска задается с консоли (класс Scanner).
 */

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int[] array = {1, 5, 8, 6, 11, 69, 1, 32, 8};
        int counterForPrecense = 0;
        int searchValue = 0;
        boolean isNumberCaptured;

        do {
            System.out.println("Enter an integer number");
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt()) {
                searchValue = scanner.nextInt();
                isNumberCaptured = false;
            } else {
                System.out.println("You entered an invalid value");
                isNumberCaptured = true;
            }
        } while (isNumberCaptured);

        for (int i = 0; i < array.length; i++) {
            if (array[i] == searchValue) {
                counterForPrecense++;
            }
        }

        System.out.println("Array");
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println(counterForPrecense == 0 ? "\nNumber " + searchValue + " is Not present in Array" : "\nNumber " + searchValue + " is present in Array");
    }
}
