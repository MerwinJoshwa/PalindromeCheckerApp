import java.util.*;


class UseCase10PalindromeCheckerApp{
        public static boolean uc10check(String input) {
            if (input == null) return false;
            String normalized = input.toLowerCase().replaceAll("[^a-z0-9]", "");

            String reversed = new StringBuilder(normalized).reverse().toString();

            return normalized.equals(reversed);
        }

}



public class PalindromeChecker {
    public static void main(String[]args){

        String test = "A man a plan a canal Panama";
        UseCase10PalindromeCheckerApp uc10=new UseCase10PalindromeCheckerApp();
        System.out.println("Palindrome Checker by UC10: "+uc10.uc10check(test));





    }
}
