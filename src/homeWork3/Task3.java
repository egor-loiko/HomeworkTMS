package homeWork3;

/*
2. Создайте и заполните массив случайными числами и выведете
максимальное, минимальное и среднее значение. Для генерации случайного
числа используйте метод Math.random(). Пусть будет возможность создавать
массив произвольного размера. Пусть размер массива вводится с консоли.
*/

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Enter an array size");
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int[] array = new int[arraySize];


        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100 + 1);
        }
        for (double element : array) {
            System.out.println(element);
        }

        int minValue = array[0];
        int maxValue = array[0];
        int sumValue = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
            sumValue += array[i];
        }

        System.out.println("Min value = " + minValue);
        System.out.println("Max value = " + maxValue);
        System.out.println("Average value = " + (double)sumValue/array.length);
    }
}
