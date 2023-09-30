package homeWork2;
/*
2. Написать программу для вывода названия поры года по
номеру месяца. При решении используйте оператор if-else-if.
 */

public class Task_2 {
    public static void main(String[] args) {
        int numberOfMonth = 1;

        if (numberOfMonth == 1 || numberOfMonth == 2 || numberOfMonth == 12) {
            System.out.println("Winter");
        } else if (numberOfMonth == 3 || numberOfMonth == 4 || numberOfMonth == 5) {
            System.out.println("Spring");
        } else if (numberOfMonth == 6 || numberOfMonth == 7 || numberOfMonth == 8) {
            System.out.println("Summer");
        } else if (numberOfMonth == 9 || numberOfMonth == 10 || numberOfMonth == 11) {
            System.out.println("Autumn");
        } else {
            System.err.println("Month with such number doesn't exist!");
        }
    }

}
