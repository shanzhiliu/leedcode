package number_3;


import org.junit.Test;

public class SolutionTest {
    @Test
    public void  test1(){

        Solution solution = new Solution();
        System.out.println(solution.lengthOfLongestSubstring("123456"));

    }

    @Test
    public void  test2(){

        Solution1 solution = new Solution1();
        System.out.println(solution.lengthOfLongestSubstring("aab"));

    }


}
