class Solution {
    public int countIslands(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int res =0;
         

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){

                if(grid[i][j]>0){
                   long counter =  dfs(grid,i,j,0);

                   if(counter>0 && counter%k==0){
                     res++;
                   }
                }
            }
        }


         

        return   res;
         
    }


    public static long dfs(int[][]grid,int i,int j,long counter){

        if(i>=grid.length || i<0 || j>=grid[0].length || j<0 || grid[i][j]==0){
                return counter;  
        }
          
         counter+=grid[i][j];
         grid[i][j] = 0;

        counter += dfs(grid,i+1,j,0)+
        +dfs(grid,i-1,j,0)
        +dfs(grid,i,j+1,0)
        +dfs(grid,i,j-1,0);

        return counter;
    }
}