package homeWork10.task3;

import java.util.Scanner;

public class SimplestWord {
    public static void main(String[] args) {
        //String str = "fffff ab f 1234 jkjk";
        String simplestWord = "";
        String str = "";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        if (scanner.hasNextLine()) {
            str = scanner.nextLine();
            System.out.println("You entered sentence:\n" + str);
        }

        String[] arrayOfWords = str.split(" ");

        long minOriginLetters = arrayOfWords[arrayOfWords.length - 1].chars().distinct().count();
        for (int i = arrayOfWords.length - 1; i >= 0; i--) {
            if (arrayOfWords[i].chars().distinct().count() <= minOriginLetters) {
                minOriginLetters = arrayOfWords[i].chars().distinct().count();
                simplestWord = arrayOfWords[i];
            }
        }
        System.out.println("The first word with minimal character difference: " + simplestWord);
    }
}
