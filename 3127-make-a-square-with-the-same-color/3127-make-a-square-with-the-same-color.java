class Solution {
    public boolean canMakeSquare(char[][] grid) {
        
         for(int i=0;i<grid.length-1;i++){

            for(int j=0;j<grid[0].length-1;j++){

                char[] colors = {grid[i][j],grid[i+1][j],grid[i][j+1],grid[i+1][j+1]};

                int white =0;
                int Black = 0;


                for(char ch:colors){
                    if(ch=='W'){
                        white++;
                    }else{
                        Black++;
                    }
                }

                if(white>=3 || Black>=3){
                    return true;
                }
            }
         }

         return false;
    }
}