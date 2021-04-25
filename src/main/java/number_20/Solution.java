package number_20;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character,Character> matchMap = new HashMap<>();
        matchMap.put('(',')');
        matchMap.put('[',']');
        matchMap.put('{','}');

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if(matchMap.keySet().contains(c)) {
                stack.add(c);
            }
            if(matchMap.values().contains(c)) {
                if(stack.isEmpty()) return false;
                Character pop = stack.pop();
                if(matchMap.get(pop) != c) {
                    return false;
                }
            }
        }

        return stack.size() == 0 ? true : false;

    }
}