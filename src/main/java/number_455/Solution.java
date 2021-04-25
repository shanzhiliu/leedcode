package number_455;

import java.util.Arrays;
import java.util.zip.CheckedOutputStream;

class Solution {
    public int findContentChildren(int[] g, int[] s) {

        Arrays.sort(g);
        Arrays.sort(s);
        int count = 0;
        int i = 0;
        int k = 0;
        for (; i < g.length && k < s.length;) {

            if(g[i] <= s[k]) {
                count ++;
                i++;
                k ++;
            }
            else {
                k ++;
            }

        }

        return count;
    }
}