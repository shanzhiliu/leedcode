package number_121;

class Solution1 {
    public int maxProfit(int[] prices) {

        if(prices.length <= 1) return 0;

        int max = 0;
        int cuLow = prices[0];

        for (int i = 1; i < prices.length; i++) {

            int cuPrice = prices[i];
            int getMoney = cuPrice - cuLow;

            if(getMoney > max) {
                max = getMoney;
            }

            if(cuPrice < cuLow) {
                cuLow = cuPrice;
            }
        }

        return  max;
    }

    public static void main(String[] args) {
        Solution1 solution = new Solution1();
        System.out.println(solution.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));


    }
}