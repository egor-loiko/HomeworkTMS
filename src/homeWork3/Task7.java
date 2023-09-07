package homeWork3;

/*
6. Создайте массив строк. Заполните его произвольными именами
людей. Отсортируйте массив. Результат выведите на консоль.
*/

import java.util.Arrays;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        int arraySize = 0;
        boolean isNumberCaptured = false;

        do {
            System.out.println("Enter an integer number");
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt()) {
                arraySize = scanner.nextInt();
                isNumberCaptured = false;
            } else {
                System.out.println("You entered an invalid value");
                isNumberCaptured = true;
            }
        } while (isNumberCaptured);

        String[] arrayOfString = new String[arraySize];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arraySize; i++) {
            System.out.println("Enter a name #" + (i + 1));
            if (sc.hasNextLine()) {
                arrayOfString[i] = sc.nextLine();
            }
        }

        System.out.println("Initial array:");
        for (String element : arrayOfString) {
            System.out.print(element + " ");
        }

        Arrays.sort(arrayOfString);
        System.out.println("\nSorted array:");
        for (String element : arrayOfString) {
            System.out.print(element + " ");
        }
    }
}
