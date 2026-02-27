import java.util.*;

interface PalindromeStrategy {
    boolean check(String input);
}

class DequeStrategy implements PalindromeStrategy {
    public boolean check(String input) {
        Deque<Character> deque = new ArrayDeque<>();

        for (char c : input.toCharArray())
            deque.addLast(c);

        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast()))
                return false;
        }
        return true;
    }
}

class UseCase12PalindromeChecker {
    PalindromeStrategy strategy;

    UseCase12PalindromeChecker(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    boolean checkPalindrome(String input) {
        return strategy.check(input);
    }
}

public class PalindromeChecker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        PalindromeStrategy ob1 = new DequeStrategy();
        UseCase12PalindromeChecker ob2 = new UseCase12PalindromeChecker(ob1);

        if (ob2.checkPalindrome(input))
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");
    }
}