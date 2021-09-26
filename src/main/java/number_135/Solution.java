package number_135;

import java.util.Arrays;

class Solution {

    public int candy(int[] ratings) {

        if(ratings == null || ratings.length < 1) {
            return 0;
        }
        if(ratings.length == 1) {
            return 1;
        }

        int count = 0;
        int[] candyCount = new int[ratings.length];

        Arrays.fill(candyCount,1);

        for (int i = 1; i < ratings.length; i++) {
            if(ratings[i] > ratings[i -1]) {
                candyCount[i] = candyCount[i - 1] + 1;
            }
        }

        for (int i = ratings.length - 2; i >= 0; i--) {
            if(ratings[i] > ratings[i + 1]) {
                if(candyCount[i] <= candyCount[i + 1]) {
                    candyCount[i] = candyCount[i + 1] + 1;
                }

            }
        }

        for (int i = 0; i < candyCount.length; i++) {
            count += candyCount[i];
        }

        return  count;
    }

    public static void main(String[] args) {

    }
}