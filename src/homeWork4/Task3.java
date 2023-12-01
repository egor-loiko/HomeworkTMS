package homeWork4;

/*3. Умножение двух матриц. Создайте два массива целых чисел размером 3х3 (две матрицы). Напишите программу для умножения двух матриц.
Первый массив: {{1,0,0,0},{0,1,0,0},{0,0,0,0}}
Второй массив: {{1,2,3},{1,1,1},{0,0,0},{2,1,0}}
Ожидаемый результат: 1 2 3 1 1 1 0 0 0
*/
public class Task3 {
    public static void main(String[] args) {
        int[][] firstArray = {
                {1, 0, 0, 0},
                {0, 1, 0, 0},
                {0, 0, 0, 0}
        };
        int[][] secondArray = {
                {1, 2, 3},
                {1, 1, 1},
                {0, 0, 0},
                {2, 1, 0}};

        int[][] resultArray = new int[firstArray.length][secondArray[0].length];

        int sum = 0;
        for (int k = 0; k < firstArray.length; k++) {
            for (int i = 0; i < firstArray.length; i++) {
                for (int j = 0; j < firstArray[i].length; j++) {
                    sum += firstArray[k][j] * secondArray[j][i];
                }
                resultArray[k][i] = sum;
                sum = 0;
            }
        }

        System.out.println("First matrix:");
        for (int i = 0; i < firstArray.length; i++) {
            for (int j = 0; j < firstArray[i].length; j++) {
                System.out.print(firstArray[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Second matrix:");
        for (int i = 0; i < secondArray.length; i++) {
            for (int j = 0; j < secondArray[i].length; j++) {
                System.out.print(secondArray[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Matrix multiplication AxB");
        for (int i = 0; i < resultArray.length; i++) {
            for (int j = 0; j < resultArray[i].length; j++) {
                System.out.print(resultArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
