package number_63;

class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;

        int[][]  result = new int[m][n];

        Integer flag = 1;
        for (int i = 0; i < m; i++) {
            if(obstacleGrid[i][0] == 1) flag = 0;
            result[i][0] = flag;
        }


        flag = 1;
        for (int i = 0; i < n; i++) {
            if(obstacleGrid[0][i] == 1) flag = 0;
            result[0][i] = flag;
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                int left = obstacleGrid[i - 1][j] == 1 ? 0 : result[i - 1][j];
                int top = obstacleGrid[i][j - 1] == 1 ? 0 : result[i][j - 1];
                result[i][j] = left + top;
            }
        }
        return  obstacleGrid[m - 1][n - 1] == 1 ? 0 : result[m - 1][n - 1];
    }
}