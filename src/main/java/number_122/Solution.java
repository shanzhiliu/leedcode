package number_122;

class Solution {
    public int maxProfit(int[] prices) {

        int count = 0;
        for (int i = 0; i < prices.length - 1; i++) {

            int getMoney =  prices[i + 1] - prices[i];
            if(getMoney > 0) {
                count += getMoney;
            }
        }
        return count;
    }
}
