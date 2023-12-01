package homeWork10.task4;

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        String str = "";
        String strCheck = "";
        int wordNumber = 0;
        boolean isNumberOfWordCorrect = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        if (scanner.hasNextLine()) {
            str = scanner.nextLine();
            System.out.println("You entered sentence:\n" + str);
        }

        do {
            try {
                System.out.println("Enter word number in the sentence for palindrome check:");
                if (scanner.hasNextInt()) {
                    wordNumber = scanner.nextInt();
                    System.out.println("You entered word number:\n" + wordNumber);
                }
                strCheck = str.split(" ")[wordNumber - 1];
                isNumberOfWordCorrect = true;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("You entered incorrect word number. Such word doesn't exist in the sentence!!!");
            }
        } while (!isNumberOfWordCorrect);

        StringBuilder stringBuilder = new StringBuilder(strCheck).reverse();

        if (strCheck.contentEquals(stringBuilder)) {
            System.out.println("The word '" + strCheck + "' is palindrome!");
        } else {
            System.out.println("The word '" + strCheck + "' is NOT palindrome!");
        }

    }
}
