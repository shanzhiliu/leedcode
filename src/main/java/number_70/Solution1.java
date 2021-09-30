package number_70;

class Solution1 {
    public int climbStairs(int n) {

        if( n <= 2) return n;
        int[] F = new int[n + 1];
        F[1] = 1;
        F[2] = 2;

        for (int i = 3; i < n + 1; i++) {
            F[i] = F[i - 1] + F[i -2];
        }
        return F[n];
    }
}