
import java.util.Stack;
import java.util.stack;

class UseCase1PalindromeCheckerApp {

    void display_welcome() {
        System.out.println("Welcome to the Palindrome Checker Management System");

    }
}

class UseCase2PalindromeCheckerApp {

    String text = "madam";

    void uc2check() {
        char[] chararray = text.toCharArray();
        boolean ch = false;
        for (int i = 0; i <= text.length() / 2; i++) {
            for (int j = text.length() - 1; j >= text.length() / 2; j--) {
                if (chararray[i] == chararray[j]) {
                    ch = true;
                }
            }
        }
        System.out.println(ch);
    }
}

class UseCase3PalindromeCheckerApp {

    void uc3check(String word) {
        String rev = "";
        boolean c3 = false;
        for (int i = word.length() - 1; i >= 0; i--) {
            rev = rev + word.charAt(i);
        }
        if (rev.equals(word)) {
            c3 = true;
        }
        System.out.println(c3);
    }
}

class UseCase4PalindromeCheckerApp {

    void uc4check(String wor) {
        char[] chars = wor.toCharArray();
        int start = 0;
        int end = chars.length - 1;
        boolean ispalindrome = false;
        while (start < end) {
            if (chars[start] == chars[end]) {
                ispalindrome = true;
                start++;
                end--;
            }
        }
        System.out.println(ispalindrome);
    }
}

class UseCase5PalindromeCheckerApp {

    Stack<Character> stack = new Stack<>();

    void uc5check(String word) {
        char[] ch = word.toCharArray();
        boolean ispalindrome = false;
        for (char c : word.toCharArray()) {
            stack.push(c);
        }
        for (int i = 0; i < word.length(); i++) {
            if (stack.pop() == ch[i]) {
                ispalindrome = true;
            }
        }
        System.out.println(ispalindrome);

    }
}

public class PalindromeChecker {

    public static void main(String[] args) {
        UseCase1PalindromeCheckerApp welcome = new UseCase1PalindromeCheckerApp();
        welcome.display_welcome();
        UseCase2PalindromeCheckerApp uc2 = new UseCase2PalindromeCheckerApp();
        uc2.uc2check();
        UseCase3PalindromeCheckerApp uc3 = new UseCase3PalindromeCheckerApp();
        String wrd = "noon";
        uc3.uc3check(wrd);
        UseCase4PalindromeCheckerApp uc4 = new UseCase4PalindromeCheckerApp();
        uc4.uc4check(wrd);
        UseCase5PalindromeCheckerApp uc5 = new UseCase5PalindromeCheckerApp();
        uc5.uc5check(wrd);
    }
}
