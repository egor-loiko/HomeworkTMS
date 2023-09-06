package homeWork2;
/*
3. Напишите программу, которая будет принимать на вход
число и на выход будет выводить сообщение четное число или нет.
Для определения четности числа используйте операцию получения
остатка от деления - операция выглядит так: '% 2').
 */

public class Task_3 {
    public static void main(String[] args) {
        int numberToCheck = 445434;

        //The first option
        if (numberToCheck % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        // The second option
        System.out.println(numberToCheck % 2 == 0 ? "Even" : "Odd");
    }
}
