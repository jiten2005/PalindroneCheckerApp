import java.util.*;

public class PalindroneCheckerApp {

    // Stack Palindrome Method
    static boolean stackPalindrome(String str) {

        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray())
            stack.push(c);

        for (char c : str.toCharArray())
            if (c != stack.pop())
                return false;

        return true;
    }

    // Deque Palindrome Method
    static boolean dequePalindrome(String str) {

        Deque<Character> deque = new ArrayDeque<>();

        for (char c : str.toCharArray())
            deque.addLast(c);

        while (deque.size() > 1)
            if (deque.removeFirst() != deque.removeLast())
                return false;

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Stack execution time
        long start1 = System.nanoTime();
        boolean result1 = stackPalindrome(input);
        long end1 = System.nanoTime();

        // Deque execution time
        long start2 = System.nanoTime();
        boolean result2 = dequePalindrome(input);
        long end2 = System.nanoTime();

        System.out.println("\nStack Result: " + result1);
        System.out.println("Stack Time: " + (end1 - start1) + " ns");

        System.out.println("\nDeque Result: " + result2);
        System.out.println("Deque Time: " + (end2 - start2) + " ns");

        sc.close();
    }
}