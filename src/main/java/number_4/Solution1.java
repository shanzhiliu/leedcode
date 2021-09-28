package number_4;

class Solution1 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {


        if(nums1.length < 1 && nums2.length < 1 ) return 0;

        int index1 = 0;
        int index2 = 0;

        int[] result = new int[nums1.length + nums2.length];
        int index = 0;
        int centerIndex = result.length / 2;
        boolean isDouble =  result.length % 2 == 0;

        while (index1 < nums1.length || index2 < nums2.length) {

             Integer value1 = null;
             Integer value2 = null;

            if(index1 < nums1.length) {
                value1 = nums1[index1];
            }

            if( index2 < nums2.length) {
                value2 = nums2[index2];
            }

            if(value1 == null) {
                result[index] = value2;
                index2++;
            }
            else if(value2 == null) {
                result[index] = value1;
                index1++;
            }
            else {
                if(value1 < value2) {
                    result[index] = value1;
                    index1++;
                }
                else
                {
                    result[index] = value2;
                    index2++;
                }
            }


            if(index == centerIndex) {
                if(isDouble)  {
                    return  (result[centerIndex - 1] +  result[centerIndex]) / 2.0;
                }
                else {
                    return result[centerIndex];
                }
            }

            index ++;

        }

        return 0;
    }

    public static void main(String[] args) {
        Solution1 solution = new Solution1();
        int[] a = new int[]{1,2};
        int[] b = new int[]{3,4};
        solution.findMedianSortedArrays(a,b);
    }
}