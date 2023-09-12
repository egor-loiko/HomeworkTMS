package homeWork4;

/*3. Умножение двух матриц. Создайте два массива целых чисел размером 3х3 (две матрицы). Напишите программу для умножения двух матриц.
Первый массив: {{1,0,0,0},{0,1,0,0},{0,0,0,0}}
Второй массив: {{1,2,3},{1,1,1},{0,0,0},{2,1,0}}
Ожидаемый результат: 1 2 3 1 1 1 0 0 0
*/
public class Task3 {
    public static void main(String[] args) {
        int[][] a = {
                {1, 0, 0, 0},
                {0, 1, 0, 0},
                {0, 0, 0, 0}
        };
        int[][] b = {
                {1, 2, 3},
                {1, 1, 1},
                {0, 0, 0},
                {2, 1, 0}};

        int[][] c = new int[a.length][b[0].length];

        int sum = 0;
        for (int k = 0; k < a.length; k++) {
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i].length; j++) {
                    sum += a[k][j] * b[j][i];
                }
                c[k][i] = sum;
                sum = 0;
            }
        }

        System.out.println("First matrix:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Second matrix:");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Matrix multiplication AxB");
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
