package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println( lengthOfLongestSubstring("abcabcbb"));
    }

//    public static int lengthOfLongestSubstring(String s) {
//        int n = s.length();
//        Set<Character> set = new HashSet<>();
//        int ans = 0, i = 0, j = 0;
//        while (i < n && j < n) {
//            // try to extend the range [i, j]
//            if (!set.contains(s.charAt(j))){
//                set.add(s.charAt(j++));
//                ans = Math.max(ans, j - i);
//            }
//            else {
//                set.remove(s.charAt(i++));
//            }
//        }
//        return ans;
//    }
    public static int lengthOfLongestSubstring(String s) {
        HashMap listOfSubstring = new HashMap();
        int temporaryCounter = 0;
        int longestSubstringNumber = 0;
        int i=0,j= 0;
        int n= s.length();

       while(i<n && j>n) {
          Set<Character> set = new HashSet<>();

            if (!set.contains(s.charAt(j))) {
                if (temporaryCounter < longestSubstringNumber) {
                    temporaryCounter = longestSubstringNumber;
                    longestSubstringNumber = 0;
                }
            } else {
                set.add(s.charAt(i));
                longestSubstringNumber++;
            }
            i++;
        }


        // listOfSubstring.put(longestSubstringNumber,uniqueCharacter.toString());
        return longestSubstringNumber;
    }


}