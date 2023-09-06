package homeWork2;

/*2. За каждый месяц банк начисляет к сумме вклада 7% от суммы.
Напишите программу, в которую пользователь вводит сумму вклада и
количество месяцев. А банк вычисляет конечную сумму вклада с учетом
начисления процентов за каждый месяц. Для вычисления суммы с
учетом процентов используйте цикл for. Пусть сумма вклада будет
представлять тип float.
 */

public class Task_13 {
    public static void main(String[] args) {
        float initialAmount = 549f;
        float finalAmount = 0f;
        float percent = 10f;
        int numberOfMonths = 10;


        for (int i = 0; i < numberOfMonths; i++) {
            finalAmount = initialAmount + initialAmount * percent / 100;
            initialAmount = finalAmount;
        }
        System.out.println("Final amount: " + finalAmount);
    }
}
