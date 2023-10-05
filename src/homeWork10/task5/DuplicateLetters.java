package homeWork10.task5;

import java.util.Scanner;

public class DuplicateLetters {
    public static void main(String[] args) {
        String str = "";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        if (scanner.hasNextLine()) {
            str = scanner.nextLine();
            System.out.println("You entered sentence:\n" + str);
        }

        StringBuilder stringBuilder = new StringBuilder(str);
        int length = stringBuilder.length();
        for (int i = 0; i < length * 2; i += 2) {
            stringBuilder.insert(i + 1, stringBuilder.charAt(i));
        }
        System.out.println(stringBuilder);
    }
}
