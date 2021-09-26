package number_22;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;

class Solution1 {
    public List<String> generateParenthesis(int n) {

        List<String> resultList = new ArrayList<>();
        generate(0, 2 * n,"",resultList);

        return resultList;
    }

    private void generate(int level  ,int max, String s,List<String> list) {

        if( level == max ) {
            list.add(s);
//            System.out.println(s);
            return;
        }
        System.out.println( "----first------" + s);
            generate(level + 1, max,s + "(",list);
        System.out.println( "----second------" + s);
//            generate(level + 1, max,s + ")",list);

    }

    public int jiecheng ( int n) {

        if( n <= 1) {

            System.out.println(n);
            return 1;
        }

        int cu = n;
        System.out.println(n);
        int before = jiecheng(n - 1);
        System.out.println(n);
        int result = cu * before;
        return  result;
    }


    public static void main(String[] args) {
        Solution1 solution = new Solution1();
        solution.jiecheng(3);
//        System.out.println(solution.generateParenthesis(2));
    }
}