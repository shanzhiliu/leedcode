package number_509;

class Solution {
    public int fib(int n) {

        Integer count =  getFib(n);
        return  count;
    }

    private Integer getFib(int n) {
        if(n <= 1)  return n;
        return  getFib(n-1) + getFib(n-2);
    }


}