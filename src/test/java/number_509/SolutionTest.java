package number_509;


import org.junit.Test;

import java.util.List;

public class SolutionTest {
    @Test
    public void  test1(){

       Solution solution = new Solution();

        int fib = solution.fib(30);

        System.out.println(fib);

    }

    @Test
    public void  test2(){

        Solution1 solution = new Solution1();

        int fib = solution.fib(30);

        System.out.println(fib);

    }




}
