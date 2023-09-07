package homeWork3;

import java.util.Random;
import java.util.Scanner;

/*
4. Создайте массив из n случайных целых чисел и выведите его на экран.
Размер массива пусть задается с консоли и размер массива может быть больше 5 и
меньше или равно 10. Если n не удовлетворяет условию - выведите сообщение об
этом. Если пользователь ввёл не подходящее число, то программа должна просить
пользователя повторить ввод. Создайте второй массив только из чётных элементов
первого массива, если они там есть, и вывести его на экран.

 */
public class Task5 {
    public static void main(String[] args) {


        boolean isNumberCaptured;
        int arraySize = 0;
        int evenNumberCounter = 0;
        int counterForFilling = 0;

        do {
            System.out.println("Enter an array size (more than 5 and less or equal 10)");
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt()) {
                arraySize = scanner.nextInt();
                if (arraySize > 5 && arraySize <= 10) {
                    isNumberCaptured = false;
                } else {
                    System.out.println("You are out of array size limits");
                    isNumberCaptured = true;
                }

            } else {
                System.out.println("You entered an invalid value");
                isNumberCaptured = true;
            }
        } while (isNumberCaptured);

        int[] firstArray = new int[arraySize];
        boolean[] helpArray = new boolean[arraySize];
        Random random = new Random();

        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = random.nextInt(25);
            if (firstArray[i] % 2 == 0) {
                helpArray[i] = true;
                evenNumberCounter++;
            }
        }

        int[] secondArray = new int[evenNumberCounter];

        System.out.println("Initial array:");
        for (int element : firstArray) {
            System.out.print(element + " ");
        }

        for (int i = 0; i < firstArray.length; i++) {
            if (helpArray[i]) {
                secondArray[counterForFilling] = firstArray[i];
                counterForFilling++;
            }
        }

        if (evenNumberCounter != 0) {
            System.out.println("\nFinal array of even numbers");
            for (int element : secondArray) {
                System.out.print(element + " ");
            }
        } else {
            System.out.println("\nArray doesn't contain even numbers");
        }
    }
}
