package CrackingTheCodingInterview;

import java.util.Arrays;

public class StringAnagram {

    public static void main(String[] args) {
        System.out.println(checkAnagram("akina","aank"));
    }

    public static boolean checkAnagram(String str1, String str2) {

        char[] charArrOne = str1.toCharArray();
        char[] charArrTwo = str2.toCharArray();

        Arrays.sort(charArrOne);
        Arrays.sort(charArrTwo);

        return Arrays.equals(charArrOne,charArrTwo);

    }
}
