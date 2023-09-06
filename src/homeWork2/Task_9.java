package homeWork2;

/*
4. Необходимо, чтоб программа выводила на экран вот такую
последовательность: 7 14 21 28 35 42 49 56 63 70 77 84 91 98. В решении
используйте цикл while.
 */

public class Task_9 {
    public static void main(String[] args) {

        //the first option
        for (int i = 7; i < 100; i += 7) {
            System.out.println(i);
        }

        //the second option
        for (int i = 1; i < 15; i++) {
            System.out.println(i * 7);
        }
    }
}
