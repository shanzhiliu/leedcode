package number_136;

class Solution {
    public int singleNumber(int[] nums) {
        int singleNumber = 0;

        for (int num : nums) {
            singleNumber = singleNumber ^ num;
        }
        return singleNumber;
    }
}