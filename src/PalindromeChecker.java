
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
        if(word==rev){
            c3=true;
        }
        System.out.println(c3);
    }
}

public class PalindromeChecker {
    public static void main(String[]args){
        UseCase1PalindromeCheckerApp welcome=new UseCase1PalindromeCheckerApp();
        welcome.display_welcome();
        UseCase2PalindromeCheckerApp uc2=new UseCase2PalindromeCheckerApp();
        uc2.uc2check();
        UseCase3PalindromeCheckerApp uc3=new UseCase3PalindromeCheckerApp();
        String wrd="";
        uc3.uc3check(wrd);

    }
}
