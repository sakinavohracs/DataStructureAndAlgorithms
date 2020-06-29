package LeetCode;

public class LongestSubstring {

    public static void main(String[] args) {
        lengthOfLongestSubstring("abcabcbba");
    }

    public static int lengthOfLongestSubstring(String s) {
        int n = s.length(), ans = 0;
        int[] index = new int[128];
        // current index of character
        // try to extend the range [i, j]
        for (int j = 0, i = 0; j < n; j++) {
            System.out.println(j);
            System.out.println(index[s.charAt(j)]);
            System.out.println(s.charAt(j));
            i = Math.max(index[s.charAt(j)], i);
            ans = Math.max(ans, j - i + 1);
            index[s.charAt(j)] = j + 1;
        }
        return ans;
    }
}
