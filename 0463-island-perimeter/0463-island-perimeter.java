class Solution {
    public int islandPerimeter(int[][] grid) {
        int result =0;
        int peri = 0;

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){

                if(grid[i][j]==1){

                    // Up 
                    if(i==0 || grid[i-1][j]==0){
                        result+=1;
                    }

                    //forward
                    if(j==grid[0].length-1 || grid[i][j+1]==0){
                        result+=1;
                    }

                    //down
                    if(i==grid.length-1 || grid[i+1][j]==0){
                        result+=1;
                    }

                    //Back
                    if(j==0 || grid[i][j-1]==0){
                        result+=1;
                    }


                }
            }
        }

        return  result;
    }
}