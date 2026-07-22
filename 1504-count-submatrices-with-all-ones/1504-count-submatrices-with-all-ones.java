class Solution {
    public int numSubmat(int[][] mat) {
         
        
        int m = mat.length;
        int n = mat[0].length;
        
        int totalrectangle =0;
        
        int dp[][] = new int[m][n];
        
        for(int i=0;i<mat.length;i++){
            int count=0;
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1){
                    count++;
                }else{
                    count=0;
                }
                dp[i][j] = count;
                }
            }
        
        
        int result =0;
        for(int i=0;i<mat.length;i++){
            
            for(int j=0;j<mat[0].length;j++){
                int min = Integer.MAX_VALUE;
                
                for(int k=i;k>=0;k--){
                        
                    min = Math.min(min,dp[k][j]);
                    if(min==0) break;
                    result+=min;
                    
                    }
                }
            }
        
        return result;
        }
    }