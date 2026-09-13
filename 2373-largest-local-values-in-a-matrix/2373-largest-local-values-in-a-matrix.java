class Solution {
    public int[][] largestLocal(int[][] grid) {

        
        
        int result[][] = new int[grid.length-2][grid[0].length-2];

        for(int i=1;i<grid.length-1;i++){
            
            for(int j=1;j<grid[0].length-1;j++){

                    int max =Integer.MIN_VALUE;
                for(int k=i-1;k<=i+1;k++){
                        for(int l =j-1;l<=j+1;l++){
                            max = Math.max(max,grid[k][l]);
                        }
                }

                result[i-1][j-1] = max;
            }
        }

        return result;
    }
}