package number_121;

class Solution {
    public int maxProfit(int[] prices) {

        if(prices.length == 1) return 0;

        int left = 0;
        int right = 0;
        int cuWinValue = 0;
        int max = cuWinValue;

        while (right < prices.length -1) {

            right ++;
            if(prices[right] > prices[right - 1]) {
                cuWinValue = prices[right] - prices[left];
                if(cuWinValue > max) {
                    max = cuWinValue;
                }

            }
            else {
                if (prices[right] < prices[left]) {
                    left = right;
                }
            }
        }
        return max;
    }
}