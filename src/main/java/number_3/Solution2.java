package number_3;

import java.util.LinkedList;
import java.util.Queue;

class Solution2 {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() < 2) return  s.length();

        Queue<Character> queue = new LinkedList<>();
        int max = 0;
        int left = 0;
        int right = 0;

        boolean flag = true;

     while (right < s.length()) {

         char rightChar = s.charAt(right);
         if(!queue.contains(rightChar)) {
             queue.offer(rightChar);
             right ++;
             flag = true;
         }
         else {
             flag = false;
             int currentSize = right - left;
             if(currentSize > max) {
                 max = currentSize;
             }
             left ++;
             queue.poll();
         }

     }

     if(flag == true) {
         int currentSize = right - left;
         if(currentSize > max) {
             max = currentSize;
         }
     }

        return max ;
    }
}