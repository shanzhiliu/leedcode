package number_605;

class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        if(flowerbed.length < 1) return false;


        int count = 0;
        int left = 0;
        int right = 0;
        for (int i = 0; i < flowerbed.length; i++) {

            if (i + 1 < flowerbed.length) {
                right = flowerbed[i+1];
            }
            else {
                right = 0;
            }

            if(left < 1 && right < 1 && flowerbed[i] == 0) {
                count ++;
                left = 1;
            }
            else {
                left = flowerbed[i];
            }

        }

        if(count >= n) return true;

        return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 2));
    }
}