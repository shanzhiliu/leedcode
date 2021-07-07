package number_50;

class Solution {
    public double myPow(double x, int n) {

        double result = 1;

        if(n < 0) {
            x = 1.0/x;
            n = -1 * n;
        }
        for (int i = 0; i < n; i++) {
            result = x * result;

        }
        return result;
    }

    public static void main(String[] args) {

        Solution solution = new Solution();
        System.out.println(solution.myPow(2,-2));
    }
}