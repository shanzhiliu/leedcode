package number_509;

//动态规划
class Solution2 {


    private Integer getFib(int n) {
        if(n <= 1)  return n;
        return  getFib(n-1) + getFib(n-2);
    }


}