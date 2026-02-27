import java.util.*;

interface PalindromeStrategy {
    boolean check(String input);
}

class StackStrategy implements PalindromeStrategy {
    public boolean check(String input) {
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
            queue.add(c);
        }

        while (!queue.isEmpty()) {
            if (!queue.remove().equals(stack.pop()))
                return false;
        }
        return true;
    }
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

class UseCase13PalindromeChecker {

    void compare(String input) {

        PalindromeStrategy stackStrategy = new StackStrategy();
        PalindromeStrategy dequeStrategy = new DequeStrategy();

        long start, end;

        start = System.nanoTime();
        boolean r1 = stackStrategy.check(input);
        end = System.nanoTime();
        long stackTime = end - start;

        start = System.nanoTime();
        boolean r2 = dequeStrategy.check(input);
        end = System.nanoTime();
        long dequeTime = end - start;

        System.out.println("Stack Strategy Result : " + r1);
        System.out.println("Stack Strategy Time   : " + stackTime + " ns");

        System.out.println("Deque Strategy Result : " + r2);
        System.out.println("Deque Strategy Time   : " + dequeTime + " ns");
    }
}

public class PalindromeChecker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        UseCase13PalindromeChecker ob1 = new UseCase13PalindromeChecker();
        ob1.compare(input);
    }
}