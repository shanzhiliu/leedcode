package number_34;

class Solution {


    public  int getleft(int[] nums, int target) {

        if(nums == null ||  nums.length == 0) return -1;

        int left = 0;
        int right = nums.length - 1;

        boolean isMatching = false;

        while ( left <= right) {

            int mid = (left + right) / 2;

            int midValue = nums[mid];

            if(midValue == target) {
                isMatching = true;
                right = mid -1;
            }

            else if(midValue > target) {
                right = mid -1;
            }

            else {
                left = mid + 1;
            }
        }

        if(isMatching) {
            return  right + 1;
        }
        return  -1;

    }

    public  int getright(int[] nums, int target) {

        if(nums == null ||  nums.length == 0) return -1;

        int left = 0;
        int right = nums.length - 1;

        boolean isMatching = false;

        while ( left <= right) {

            int mid = (left + right) / 2;

            int midValue = nums[mid];

            if(midValue == target) {
                isMatching = true;
                left = mid + 1;
            }

            else if(midValue > target) {
                right = mid -1;
            }

            else {
                left = mid + 1;
            }
        }

        if(isMatching) {
            return  left - 1;
        }
        return  -1;


    }

    public int[] searchRange(int[] nums, int target) {

        int[] result = new int[2];

        result[0] = getleft(nums,target);
        result[1] = getright(nums,target);

        return result;

    }

    public static void main(String[] args) {

        Solution solution = new Solution();
        System.out.println(solution.searchRange(new int[] {1,10,10,20},20)[0]);
        System.out.println(solution.searchRange(new int[] {1,10,10,20},20)[1]);

    }

}