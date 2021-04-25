package number_455;


import org.junit.Test;

import java.util.List;

public class SolutionTest {
    @Test
    public void  test1() {

        int[] g = new int[]{10,9,8,7};
        int[] s = new int[]{5,6,7,8};

        Solution solution = new Solution();
        Integer count = solution.findContentChildren(g, s);
        System.out.println(count);
    }

}


