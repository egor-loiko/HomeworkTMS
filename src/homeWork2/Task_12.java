package homeWork2;

/*1. Выведите на экран первые 11 членов последовательности
        Фибоначчи.
*/

public class Task_12 {
    public static void main(String[] args) {
        int firstNumber = 0;
        int secondNumber = 1;
        int fibonachiSum = 0;

        for (int i = 0; i < 11; i++) {
            if (i == 0) {
                fibonachiSum = 0;
                System.out.println(fibonachiSum);
            } else if (i == 1) {
                fibonachiSum = 1;
                System.out.println(fibonachiSum);
            } else if (i > 1) {
                fibonachiSum = firstNumber + secondNumber;
                firstNumber = secondNumber;
                secondNumber = fibonachiSum;
                System.out.println(fibonachiSum);
            }
        }
    }
}
