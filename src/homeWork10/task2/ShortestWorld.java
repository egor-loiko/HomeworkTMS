package homeWork10.task2;

import java.util.Scanner;

public class ShortestWorld {
    public static void main(String[] args) {

        String str = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        if (scanner.hasNextLine()) {
            str = scanner.nextLine();
            System.out.println("You entered sentence:\n" + str);
        }

        String[] arrayOfWords = str.split(" ");

        int minLength = arrayOfWords[0].length();
        int maxLength = arrayOfWords[0].length();
        int indexOfShortWord = 0;
        int indexOfLongWord = 0;
        for (int i = 0; i < arrayOfWords.length; i++) {
            if (arrayOfWords[i].length() <= minLength) {
                minLength = arrayOfWords[i].length();
                indexOfShortWord = i;
            }
            if (arrayOfWords[i].length() >= maxLength) {
                maxLength = arrayOfWords[i].length();
                indexOfLongWord = i;
            }
        }
        System.out.println("The shortest word is: '" + arrayOfWords[indexOfShortWord] + "' with length = " + minLength);
        System.out.println("The longest word is: '" + arrayOfWords[indexOfLongWord] + "' with length = " + maxLength);
    }
}
