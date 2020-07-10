package CrackingTheCodingInterview;

import java.util.HashSet;

public class IsUnique {

//Is Unique: Implement an algorithm to determine
// if a string has all unique characters.
// What if you cannot use additional data structures?

    public static void main(String[] args) {
        System.out.println(checkIsUnique(null));
    }

    public static boolean checkIsUnique(String str){

        if(str == null){
           throw new NullPointerException();
        }
        HashSet<Character> values = new HashSet<>();
        for(int i = 0; i<str.length();i++){
            values.add(str.charAt(i));
        }

        if (values.size() == str.length()) return true;
        else return false;
    }

}
