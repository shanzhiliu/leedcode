package number_53;


/**
// d[i] 是以arr(i)结尾的最大连续数组和

// 当 i = 10 那就是已arr(10)结尾的连续最大和,
// 已arr(10)结尾的连续最大和 分为两种情况,
   第一种 d[10 - 1] <=0 那就是 从d[10]开始,一个元素,最大值就是arr[10]
   第二种 d[10 - 1] > 那就是d[9] + arr[10]
 *
 * 最大值 就是比较从以arr[0]结尾  到 arr[i-1]结尾的最大值
 */
class Solution3 {
    public int maxSubArray(int[] nums) {

        if(nums.length < 1) return 0;
        if(nums.length == 1 ) return  nums[0];


        int[] d = new int[nums.length + 1];
        d[0] = nums[0];
        int max = d[0];

        for (int i = 1; i < nums.length; i++) {

            if(d[i - 1] > 0) {
                d[i] = nums[i] + d[i - 1];
            }
            else  {
                d[i] = nums[i];
            }

            max = Math.max(max,d[i]);
        }

        return max;
    }


}