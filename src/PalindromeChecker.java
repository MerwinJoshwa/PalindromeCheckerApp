import java.util.*;

class UseCase1PalindromeCheckerApp{
    void display_welcome(){
        System.out.println("Welcome to the Palindrome Checker Management System");

    }
}

class UseCase2PalindromeCheckerApp{
    String text="madam";
    void uc2check(){
        char[] chararray =text.toCharArray();
        boolean ch=false;
        for(int i=0;i<=text.length()/2;i++){
            for(int j=text.length()-1;j>=text.length()/2;j--){
                if(chararray[i]==chararray[j]){
                    ch=true;
                }
            }
        }
        System.out.println(ch);
    }
}

class UseCase3PalindromeCheckerApp{
    void uc3check(String word){
        String rev="";
        boolean c3=false;
        for(int i=word.length()-1;i>=0;i--){
            rev=rev+word.charAt(i);
        }
        if(rev.equals(word)){
            c3=true;
        }
        System.out.println(c3);
    }
}

class UseCase4PalindromeCheckerApp{
    void uc4check(String wor){
        char[] chars=wor.toCharArray();
        int start=0;
        int end=chars.length-1;
        boolean ispalindrome=false;
        while(start<end){
            if(chars[start]==chars[end]){
                ispalindrome=true;
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

class UseCase6PalindromeCheckerApp {

    void uc6check(String input) {

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            queue.add(c);
            stack.push(c);
        }

        boolean isPalindrome = true;

        while (!queue.isEmpty()) {
            if (!queue.remove().equals(stack.pop())) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println(isPalindrome);

    }
}

class UseCase7PalindromeCheckerApp {

    void uc7check(String input) {

        Deque<Character> deque = new ArrayDeque<>();

        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        boolean isPalindrome = true;

        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println(isPalindrome);

    }
}

class UseCase8PalindromeCheckerApp{
    void uc8check(String input){
        LinkedList<Character> list=new LinkedList<>();
        for(char c:input.toCharArray()){
            list.add(c);
        }
        boolean isPalindrome=false;
        while(list.size()>1){
            if(list.getFirst()==list.getLast()){
                isPalindrome=true;
                break;
            }
        }
        System.out.println(isPalindrome);
    }
}



public class PalindromeChecker {
    public static void main(String[]args){
        UseCase1PalindromeCheckerApp welcome=new UseCase1PalindromeCheckerApp();
        welcome.display_welcome();
        UseCase2PalindromeCheckerApp uc2=new UseCase2PalindromeCheckerApp();
        uc2.uc2check();
        UseCase3PalindromeCheckerApp uc3=new UseCase3PalindromeCheckerApp();
        String wrd="level";
        uc3.uc3check(wrd);
        UseCase4PalindromeCheckerApp uc4=new UseCase4PalindromeCheckerApp();
        uc4.uc4check(wrd);
        UseCase5PalindromeCheckerApp uc5=new UseCase5PalindromeCheckerApp();
        uc5.uc5check(wrd);
        UseCase6PalindromeCheckerApp uc6=new UseCase6PalindromeCheckerApp();
        uc6.uc6check(wrd);
        UseCase7PalindromeCheckerApp uc7=new UseCase7PalindromeCheckerApp();
        uc7.uc7check(wrd);
        UseCase8PalindromeCheckerApp uc8=new UseCase8PalindromeCheckerApp();
        uc8.uc8check(wrd);



    }
}
