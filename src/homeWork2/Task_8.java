package homeWork2;

import java.util.Scanner;

/*
3. Напишите программу, где пользователь вводит любое целое
положительное число. А программа суммирует все числа от 1 до
введенного  пользователем числа. Для ввода числа воспользуйтесь
классом Scanner.
 */

public class Task_8 {
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner scanner = new Scanner(System.in);
        int intNumber = scanner.nextInt();

        int result = 0;
        for (int i = 1; i <= intNumber; i++) {
            result += i;
        }
        System.out.println(result);
    }
}
