package number_3;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

class Solution3 {

    public int lengthOfLongestSubstring(String s) {
         if(s.length() < 2) return s.length();

         int max = 0;
        int left = 0;

        HashMap<Character,Integer> saveMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);

            if(saveMap.containsKey(c)) {
                left = Math.max(left,saveMap.get(c) + 1);
            }

            saveMap.put(c,i);
            max = Math.max(max,i - left + 1);

        }

        return max;

    }

}