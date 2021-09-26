package number_435;

import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {

        if(intervals.length < 2) return 0;

        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1] != o2[1]) {

                    return Integer.compare(o1[1],o2[1]);
                }
                else {
                    return  Integer.compare(o2[0],o1[0]);
                }
            }
        });

        int count = 1;
        int right = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {

            //记录的右边小于左边,更换记录的右边
            if(right <= intervals[i][0]) {
                count ++;
                right = intervals[i][1];
            }

        }

        return intervals.length - count;
    }

    public static void main(String[] args) {

        Integer[] shan = new Integer[]{1,2,3,4};

        Arrays.sort(shan, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                System.out.println(o1 + "----" + o2);
                return Integer.compare(o1,o2);
            }
        });

        Arrays.stream(shan).forEach(s -> System.out.println(s));
        System.out.println(Integer.compare(1, 2));
        System.out.println(Integer.compare(2, 2));
        System.out.println(Integer.compare(2, 1));


    }
}