package homeWork3;

import java.util.Scanner;

/*
2. Создайте массив целых чисел. Удалите все вхождения заданного
числа из массива. Пусть число задается с консоли (класс Scanner).
Если такого числа нет - выведите сообщения об этом.
В результате должен быть новый массив без указанного числа.
 */

public class Task2 {
    public static void main(String[] args) {
        int[] initialArray = {1, 4, 5, 2, 8, 5, 9, 1};
        boolean[] helpArray = new boolean[initialArray.length];
        int counterForDelete = 0;
        int counterForFilling = 0;
        System.out.println("Enter an integer number");
        Scanner scanner = new Scanner(System.in);
        int valueForRemove = scanner.nextInt();

        for (int i = 0; i < initialArray.length; i++) {
            if (initialArray[i] == valueForRemove) {
                helpArray[i] = true;
                counterForDelete++;
            }
        }

        System.out.println("Initial array");
        for (int element : initialArray) {
            System.out.print(element + " ");
        }

        if (counterForDelete == 0) {
            System.out.println("\nNubmer " + valueForRemove + " is not present in the array");
        } else {
            System.out.println("\nFinal array");
            int[] finalArray = new int[initialArray.length - counterForDelete];

            for (int i = 0; i < initialArray.length; i++) {
                if (!helpArray[i]) {
                    finalArray[counterForFilling] = initialArray[i];
                    System.out.print(finalArray[counterForFilling] + " ");
                    counterForFilling++;
                }
            }
        }
    }
}
