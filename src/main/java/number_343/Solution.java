package number_343;

import javax.sound.midi.Soundbank;

//这个 d[i] 是代表 拆分后 的乘机 或者不拆的时候, 最大的值
// 根据已有知识 得到 , 当 n >=4 的时候, 拆分的乘机 一定会大于这个这个数本身
// 所以说 >= 4的时候,就不拆 1 和 n -1 这个情况了, 因为 (n - 1) * 1 不如把这个乘机 加到 n-1拆分的子项中了

/**
 * 10  3 3 4
 * 11  1 * 10 < (3 + 1) 3 4
 */
class Solution {
    public int integerBreak(int n) {

        if(n < 2) return 0;

        int[] d = new int[n + 1];

        if(n <= 4) {
            d = new int[5];
            d[1] = 1;
            d[2] = 1;
            d[3] = 2;
            d[4] = 4;
            return d[n];
        }


        d[1] = 1;
        d[2] = 2;

        for (int i = 3; i < n + 1; i++) {

            int center = i / 2;
            int cuMax = i;

            for (int j = 2; j <= center; j++) {
                int left = j;
                int right = i - j;
                cuMax =  Math.max(cuMax,left * d[right]);

            }
            d[i] = cuMax;
        }

        return d[n];
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.integerBreak(10));
    }
}