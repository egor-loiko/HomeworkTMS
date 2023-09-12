package homeWork4;

/*2. Шахматная доска. Создать программу для раскраски шахматной доски с помощью цикла.
Создать двумерный массив String'ов 8х8. С помощью циклов задать элементам циклам значения
B(Black) или W(White). Результат работы программы:
*/
public class Task2 {
    public static void main(String[] args) {
        String[][] chessBoard = new String[8][8];

        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[i].length; j++) {
                if (i % 2 == 0) {
                    if (j % 2 == 0) {
                        chessBoard[i][j] = "W";
                    } else {
                        chessBoard[i][j] = "B";
                    }
                } else {
                    if (j % 2 == 0) {
                        chessBoard[i][j] = "B";
                    } else {
                        chessBoard[i][j] = "W";
                    }
                }
            }
        }

        System.out.println("Chess Board output:");
        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[i].length; j++) {
                System.out.print(chessBoard[i][j] + " ");
            }
            System.out.println();
        }

    }
}
