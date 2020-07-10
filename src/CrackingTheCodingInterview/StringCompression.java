package CrackingTheCodingInterview;

import java.text.CharacterIterator;
import java.text.StringCharacterIterator;

public class StringCompression {

    //String Compression: Implement a method to perform basic
    // string compression using the counts of repeated characters.
    // For example, the string aabcccccaaa would become a2blc5a3, If the "compressed" string would not become smaller than the original string, your method should return the original string. You can assume the string has only uppercase and lowercase letters (a - z).
   // Hints: #92, if 110

    public static void main(String[] args) {

    }

    public static void compressString(String str){

        CharacterIterator s = new StringCharacterIterator(str.toString());
        while(s.current()!=CharacterIterator.DONE){
            int counter = 0;
            while(s.current()==s.next()){
                counter++;
            }

        }
        for(int i=0;i<str.length();i++){

        }
    }
}
