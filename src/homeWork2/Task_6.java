package homeWork2;

/*
1. При помощи цикла for вывести на экран нечетные числа от 1 до
99.  При решении используйте операцию инкремента (++).
 */

public class Task_6 {
    public static void main(String[] args) {

        //the first option
        for (int i = 1; i < 100; i++) {
            System.out.println(i);
            i++;
        }

        //the second option
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
