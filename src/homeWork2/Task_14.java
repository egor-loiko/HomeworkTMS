package homeWork2;

/*
3. Напишите программу, которая выводит на консоль таблицу
умножения.
*/

public class Task_14 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("------------\nTable on " + i);
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " * " + j + " = " + i * j);
            }

        }
    }
}
