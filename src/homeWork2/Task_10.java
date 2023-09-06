package homeWork2;

/*
5. Вывести 10 первых чисел последовательности 0, -5,-10,-15..
 */

public class Task_10 {
    public static void main(String[] args) {

        //the first option
        for (int i = 0; i > -50; i -= 5) {
            System.out.println(i);
        }

        //the second option
        for (int i = 0; i < 10; i++) {
            System.out.println(i * -5);
        }
    }
}
