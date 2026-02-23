public class PalindroneCheckerApp {

    public static void main(String[] args) {

        // Step 1: Declare and initialize string
        String original = "level";

        // Step 2: Reverse the string using for loop
        String reversed = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        // Step 3: Compare original and reversed string
        if (original.equals(reversed)) {
            System.out.println("The string \"" + original + "\" is a Palindrome.");
        } else {
            System.out.println("The string \"" + original + "\" is NOT a Palindrome.");
        }

        // Step 4: Program ends
        System.out.println("Program completed.");

    }
}