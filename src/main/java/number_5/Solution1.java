package number_5;

import javax.sound.midi.Soundbank;
import java.util.Stack;

/**
 * 暴力解法
 */
class Solution1 {
    public String longestPalindrome(String s) {

        if (s == null) return null;
        if(s.length() < 2) return s;

        int max = 0;
        String resultStr = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                 String substring = s.substring(i, j + 1);

                if( isPalindrome(substring) == true) {
                    if(substring.length() > max) {
                        max = substring.length();
                        resultStr = substring;
                    }
                }

            }
        }

        return resultStr;
    }

    public  boolean isPalindrome(String s){
        for (int i = 0; i < s.length() / 2; i++) {
            if(s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Solution1 solution1 = new Solution1();
        System.out.println(solution1.longestPalindrome("abacbacbc"));

    }
}