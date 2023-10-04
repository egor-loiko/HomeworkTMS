package homeWork3;

/*3. Создайте 2 массива из 5 чисел. Выведите массивы на консоль в двух
отдельных строках. Посчитайте среднее арифметическое элементов каждого
массива и сообщите, для какого из массивов это значение оказалось больше
(либо сообщите, что их средние арифметические равны).
*/

public class Task4 {
    public static void main(String[] args) {

        int[] firstArray = {5, 7, 8, 1, 2};
        int[] secondArray = {7, 5, 2, 6, 4};
        int sumFirstArray = 0;
        int sumSecondArray = 0;
        System.out.println("The first array");
        for (int i = 0; i < firstArray.length; i++) {
            System.out.print(firstArray[i] + " ");
            sumFirstArray += firstArray[i];
        }
        System.out.println("\nThe second array");
        for (int i = 0; i < secondArray.length; i++) {
            System.out.print(secondArray[i] + " ");
            sumSecondArray += secondArray[i];
        }

        double averageFirstArray = (double) sumFirstArray / firstArray.length;
        double averageSecondArray = (double) sumSecondArray / secondArray.length;

        if (averageFirstArray > averageSecondArray) {
            System.out.println("\nAverage of the First array (" + averageFirstArray + ") is greater than average of the Second array (" + averageSecondArray + ")");
        } else if (averageFirstArray == averageSecondArray) {
            System.out.println("\nAverage of the First array (" + averageFirstArray + ") is equal to average of the Second array (" + averageSecondArray + ")");
        } else {
            System.out.println("\nAverage of the First array (" + averageFirstArray + ") is less than average of the Second array (" + averageSecondArray + ")");
        }
    }
}
