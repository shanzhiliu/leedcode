package number_5;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

class Solution {
    public String longestPalindrome(String s) {

        int max = 0;
        String maxStr =  "";
        for (int i = 0; i < s.length(); i++) {

            Stack<Character> stack = new Stack<>();
            boolean flag = true;
            for (int j = i; j < s.length(); j++) {
                char c = s.charAt(j);

                if(stack.size() > 0) {
                    Character cuTopChar = stack.peek();

                    if(cuTopChar == c) {
                        stack.pop();
                        if(stack.isEmpty()) {
                            String substring = s.substring(i, j + 1);
                            if(substring.length() > max) {
                                max = substring.length();
                                maxStr = substring;
                            }
                            break;
                        }

                    } else {
                        stack.push(c);
                    }

                }
                else  {
                    stack.push(c);
                }

            }

        }

        return maxStr;
    }
}