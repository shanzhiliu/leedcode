package number_343;

/**
 *
 * d[i] 这个数字 拆分后的最大的值.
 *
 * 首先把n 拆分成两个数,这个就是拆分了
 *
 * 查分情况有两种 i * (n - i)
 *
 * 如果 n - 1 拆分的话 最大值 就是 i * d (n - i)
 * 如果 n - 1不拆分的话 最大值 就是 i * n - i
 *
 * d[i] 最大值 就是上边的比较 最大值
 * 不论上一步拆不拆 都是拆分2个数,就是拆了.
 *
 *  n = i * (n - i)
 *
 *
 *  应该思索是一个数字n要拆分,第一位是 1 或者 2 或者 3 ... n-1, 这个其实就是所有的组合了
 *
 *  1 * f(n-1)  2 * f(n-2) ... (n-1) * f(1)
 *
 *  不应该是下边这个想法
 *  i * (n - i) 不拆  i *  (n-1)
 *  i * (n - i) 拆其中一个  F(i)*  (n- i) 或者 i *  f(n-i)  在遍历过程中 i 和 n -i 会替换,只拆右边就行了
 *  i * (n - i) 不拆  f(i) *  f(n-i) 这个再拆 还会拆到第一种情况,以第一个数字为开始,是有重复的
 *
 */
class Solution1 {


    public int integerBreak(int n) {

        if(n < 2) return 0;

        int[] d = new int[n + 1];

        d[1] = 1;
        d[2] = 1;

        for (int i = 3; i < n + 1; i++) {

            for (int j = 1; j < i; j++) {
                d[i] =  Math.max( d[i] , Math.max(j * d[i - j] , j * (i - j) ));
            }
        }

        return  d[n];
    }

}