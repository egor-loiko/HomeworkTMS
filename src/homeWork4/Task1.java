package homeWork4;

import java.util.Scanner;

/*1. Создать трехмерный массив из целых чисел. С помощью
циклов "пройти" по всему массиву и увеличить каждый
элемент на заданное число. Пусть число, на которое будет
увеличиваться каждый элемент, задается из консоли.
*/
public class Task1 {
    public static void main(String[] args) {

        int[][][] array = {
                {{1, 5, 8}, {8, 9, 51}, {7, 15, 17}},
                {{44, 21, 1}, {7, 98, 12}, {2, 32, 14}},
                {{48, 15, 9}, {45, 13, 6}, {9, 13, 5}}
        };
        int numberToIncease = 0;
        boolean isNumberCaptured = true;

        do {
            System.out.println("Enter an integer number");
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt()) {
                numberToIncease = scanner.nextInt();
                isNumberCaptured = false;
            } else {
                System.out.println("You entered an invalid value");
            }
        } while (isNumberCaptured);


        System.out.println("Initial array:");
        System.out.println("_______");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    System.out.print(array[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println("_______");
        }

        System.out.println("Modified array:");
        System.out.println("_______");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    System.out.print(array[i][j][k] + numberToIncease + " ");
                }
                System.out.println();
            }
            System.out.println("_______");
        }
    }
}
