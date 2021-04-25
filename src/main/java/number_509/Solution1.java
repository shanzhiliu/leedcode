package number_509;

class Solution1 {
    public int fib(int n) {

        Integer count =  getFib(n);
        return  count;
    }

    private Integer getFib(int n) {
        if(n <= 1)  return n;

        int first = 0;
        int second = 1;
        Integer count = 0;
        for (int i = 2; i <= n; i++) {
            count = first + second;
            first = second;
            second = count;
        }
        return count;
    }


}