import java.util.*;

public class PalindroneCheckerApp {

    public static boolean isPalindrome(String str) {

        Deque<Character> deque = new ArrayDeque<>();

        str = str.toLowerCase();

        // insert characters into deque
        for (char c : str.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                deque.addLast(c);
            }
        }

        // compare front and rear
        while (deque.size() > 1) {
            char front = deque.removeFirst();
            char rear = deque.removeLast();

            if (front != rear) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        if (isPalindrome(input))
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");

        sc.close();
    }
}
