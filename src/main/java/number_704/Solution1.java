package number_704;

class Solution1 {
    public int search(int[] nums, int target) {

        if(nums == null ||  nums.length == 0) return -1;

        int left = 0;
        int right = nums.length - 1;

        while ( left <= right) {

            int mid = (left + right) / 2;

            int midValue = nums[mid];

            if(midValue == target) {
                right = mid -1;
            }

           else if(midValue > target) {
                right = mid -1;
            }

            else {
                left = mid + 1;
            }
        }

        return  right;
    }

    public static void main(String[] args) {
        Solution1 solution = new Solution1();

        int[] nums = new int[]{1,5,5,5,5,40};
        System.out.println(solution.search(nums,9));
        System.out.println(solution.search(nums,3));
        System.out.println(solution.search(nums,50));
        System.out.println(solution.search(nums,5));


    }
}