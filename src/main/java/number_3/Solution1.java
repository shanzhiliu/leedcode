package number_3;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

class Solution1 {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() < 2) return  s.length();

        Queue<Character> queue = new LinkedList<>();
        int max = 0;
        int left = 0;
        int right = 0;

     while (right < s.length()) {

         char rightChar = s.charAt(right);
         if(!queue.contains(rightChar)) {
             queue.offer(rightChar);
             right ++;

             int currentSize = right - left;
             if(currentSize > max) {
                 max = currentSize;
             }

         }
         else {
             left ++;
             queue.poll();
         }

     }

        return max ;
    }
}