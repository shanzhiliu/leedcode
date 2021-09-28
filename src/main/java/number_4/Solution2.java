package number_4;

class Solution2 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {


        if(nums1.length < 1 && nums2.length < 1 ) return 0;

        int index1 = 0;
        int index2 = 0;

        int[] result = new int[nums1.length + nums2.length];
        int index = 0;
        while (index1 < nums1.length && index2 < nums2.length) {

            Integer value1 = nums1[index1];
            Integer value2 = nums2[index2];

            if(value1 < value2) {
                result[index] = nums1[index1];
                index1++;
            }
            else {
                result[index] = nums2[index2];
                index2++;
            }

            index ++;
        }

        if(index1 < nums1.length) {

            for (int i = index1; i < nums1.length; i++) {
                result[index] = nums1[i];
                index ++;
            }
        }
        else {
            for (int i = index2; i < nums2.length; i++) {
                result[index] = nums2[i];
                index ++;
            }
        }

        int centerIndex = result.length / 2;
        if(result.length % 2 == 0) {
            return  (result[centerIndex - 1] +  result[centerIndex]) / 2.0;
        }
        else {
            return  result[centerIndex];
        }

    }

    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        int[] a = new int[]{1,2};
        int[] b = new int[]{3,4};
        solution.findMedianSortedArrays(a,b);
    }
}