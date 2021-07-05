package number_704;

class Solution {
    public int search(int[] nums, int target) {

        if(nums == null ||  nums.length == 0) return -1;

        int left = 0;
        int right = nums.length - 1;

        while ( left <= right) {

            int mid = (left + right) / 2;

            int midValue = nums[mid];

            if(midValue == target) {
                return mid;
            }

           else if(midValue > target) {
                right = mid -1;
            }

            else {
                left = mid + 1;
            }
        }


        return  -1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums = new int[]{1,2,3,6};
        System.out.println(solution.search(nums,9));
        System.out.println(solution.search(nums,2));
        System.out.println(solution.search(nums,-1));


    }
}