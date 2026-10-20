class Solution {
    public int minimumOperations(int[][] grid) {
        int result =0;


        for(int i=0;i<grid[0].length;i++){

            for(int j=1;j<grid.length;j++){

                if(grid[j][i]>grid[j-1][i]){
                    continue;
                }else {
                    int temp = grid[j-1][i]-grid[j][i];
                    result += temp+1;
                    grid[j][i] += temp+1;
                }
            }
        }
        return result;
    }
}