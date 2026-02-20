class UseCase1PalindromeCheckerApp{
    void display_welcome(){
        System.out.println("Welcome to the Palindrome Checker Management System");

    }
}

public class PalindromeChecker {
    public static void main(String[]args){
        UseCase1PalindromeCheckerApp welcome=new UseCase1PalindromeCheckerApp();
        welcome.display_welcome();

    }
}
