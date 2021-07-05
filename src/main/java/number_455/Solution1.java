package number_455;

import java.util.Arrays;

class Solution1 {
    public int findContentChildren(int[] g, int[] s) {

        int count = 0;

        Arrays.sort(g);
        Arrays.sort(s);

        int gIndex = 0;
        int sIndex = 0;

        for (;gIndex < g.length && sIndex < s.length;) {

            if(s[sIndex] >= g[gIndex] ) {
                gIndex ++;
                sIndex ++;
                count ++;
            }
            else {
                sIndex ++;
            }
        }

        return count;
    }
}