package number_22;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> generateParenthesis(int n) {

        List<String> resultList = new ArrayList<>();
        generate(0,0, n,"",resultList);

        return resultList;
    }

    private void generate(int left, int right ,int n, String s,List<String> list) {

        if(left == n && right == n) {
            list.add(s);
//            System.out.println(s);
            return;
        }

        if(left < n) {
            generate(left + 1,right, n,s + "(",list);
        }

        if(left > right) {
            generate(left ,right + 1, n,s + ")",list);
        }

    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.generateParenthesis(3));
    }
}