package CrackingTheCodingInterview;

public class Palindrome {

    public static void main(String[] args) {
        System.out.println(checkPalindrome("sakkas"));
    }

    public static boolean checkPalindrome(String str){
        int pointerEnd = str.length()-1;

        int pointerStart = 0;
        while(pointerStart <pointerEnd){
            if(str.charAt(pointerStart) != str.charAt(pointerEnd)){
                return false;
            }
            pointerStart ++;
            pointerEnd --;
        }
        return true;
    }

    public boolean checkPalindrome(int num){
        return false;
    }
}
