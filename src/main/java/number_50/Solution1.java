package number_50;

class Solution1 {
    public double myPow(double x, int n) {

        if(n < 0) {
            x = 1.0/x;
            n = -1 * n;
        }

        double result =   myHandle(x, n);
        return result;
    }

    private double myHandle(double x, int n) {

        if(n == 0) {
            return 1;
        }

        double subResult = myHandle(x, n / 2);
        double result = 0;

        if(n % 2 == 0) {
            result = subResult * subResult;
        }
        else {
            result = subResult * subResult * x;
        }

        return result;
    }


    public static void main(String[] args) {

        Solution1 solution = new Solution1();
        System.out.println(solution.myPow(2,-2));
    }
}