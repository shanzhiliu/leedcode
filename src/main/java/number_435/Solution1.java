package number_435;

import java.util.Arrays;
import java.util.Comparator;

class Solution1 {
    public int eraseOverlapIntervals(int[][] intervals) {

        if(intervals.length < 2) return 0;

        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return  Integer.compare(o1[0],o2[0]);
            }
        });

        int remove = 0;
        int right = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {

            //记录的右边,比这个左边大(有重合),记录右边选择两者的最小值
            if(right > intervals[i][0]) {
                remove ++;
                right = Math.min(intervals[i][1],right);
            }

            //记录的右边,没有这个左边大(没有有重合),记录右边选择这个的右边
            else {
                right = intervals[i][1];
            }

        }

        return remove;
    }

    public static void main(String[] args) {


    }
}