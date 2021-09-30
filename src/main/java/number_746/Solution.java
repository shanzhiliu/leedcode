package number_746;

class Solution {
    public int minCostClimbingStairs(int[] cost) {
        if(cost.length < 2) return 0;

        int[] F = new int[cost.length + 1];
        F[0] = cost[0];
        F[1] = cost[1];
        for (int i = 2; i <= cost.length; i++) {
            if(i == cost.length) {
                F[i] = Math.min( F[i - 1] ,  F[i - 2]) + 0;
            }
            else {
                F[i] = Math.min( F[i - 1] ,  F[i - 2]) + cost[i];
            }

        }
        return F[cost.length];

    }
}
