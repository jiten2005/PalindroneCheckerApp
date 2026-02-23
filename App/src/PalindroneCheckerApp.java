import java.util.Scanner;

/**
 * ============================================================
 * MAIN CLASS - PalindroneCheckerApp
 * ============================================================
 *
 * Use Case 3: Palindrome Check Using String Reverse
 *
 * Description:
 * This implementation checks whether a given string is
 * a palindrome by reversing the string and comparing it
 * with the original.
 *
 * Concepts Used:
 * - Scanner (User Input)
 * - String
 * - for loop
 * - charAt()
 * - equalsIgnoreCase() method
 * - String concatenation
 */

public class PalindroneCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String original = scanner.nextLine();

        String reversed = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        if (original.equalsIgnoreCase(reversed)) {
            System.out.println(original + " is a Palindrome.");
        } else {
            System.out.println(original + " is NOT a Palindrome.");
        }

        scanner.close();
    }
}