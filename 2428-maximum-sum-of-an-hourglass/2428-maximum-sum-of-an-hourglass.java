class Solution {
    public int maxSum(int[][] grid) {
       int result =0;
        int m = grid.length;
        int n = grid[0].length;

        for(int i=1;i<m-1;i++){

            for(int j=1;j<n-1;j++){

                int add = grid[i][j] + grid[i-1][j]+grid[i-1][j-1]+grid[i-1][j+1] + grid[i+1][j] + grid[i+1][j-1] + grid[i+1][j+1];

                result = Math.max(result,add);
            }
        }

        return result;
        
    }
}