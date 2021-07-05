package number_7;

class Solution {
    public int reverse(int x) {

        int res = 0;

        while (x != 0) {
            int carryValue = x % 10;

            if(res > 214748364 || (res == 214748364 && carryValue > 7)) {
                return 0;
            }

            if(res < -214748364 || (res == -214748364 && carryValue < -8)) {
                return 0;
            }

            res = res * 10 + carryValue;
            x = x / 10;
        }
        return  res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.reverse(123));
        System.out.println(solution.reverse(-123));


        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
    }
}