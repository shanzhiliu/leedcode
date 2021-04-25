package number_3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() < 2) return  s.length();

        int max = 0;
        for (int i = 0; i < s.length(); i++) {

            Set<Character> set = new HashSet<>();
            boolean flag = true;
            for (int j = i; j < s.length(); j++) {
                char c = s.charAt(j);

                if(set.contains(c)) {
                    int currentSize = j - i;
                    if(currentSize > max) {
                        max = currentSize;
                    }
                    flag = false;
                    break;
                }

                set.add(c);
            }

            if(flag == true) {
                int currentSize = s.length() - i;
                if(currentSize > max) {
                    max = currentSize;
                }
            }

        }

        return max;
    }
}