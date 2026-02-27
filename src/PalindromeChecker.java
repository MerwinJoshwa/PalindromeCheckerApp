import java.util.*;



class PalindromeService {


    public boolean checkPalindrome(String input) {
        if (input == null) return false;
        int start =0;
        char[] ch=input.toCharArray();
        int end =input.length()-1;
        boolean ispalindrome=false;
        while(start<end){
            if(ch[start]==ch[end]){
                ispalindrome=true;
            }
            start++;
            end--;
        }
        return ispalindrome;

    }
}
public class PalindromeChecker {
    public static void main(String[] args) {
        PalindromeService service = new PalindromeService();

        String test1 = "madam";
        System.out.println("" + service.checkPalindrome(test1));
    }
}





