package number_452;

import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int findMinArrowShots(int[][] points) {
        if(points.length < 2) {
            return points.length;
        }

        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return Integer.compare(o1[1],o2[1]);
            }
        });

        int count = 1;
        int right = points[0][1];

        for (int i = 1; i < points.length; i++) {

            if(right < points[i][0]) {
                count ++;
                right = points[i][1];
            }
        }

        return count;
    }
}