class Solution {
    private int distinct(int i,int j,String s,String t,int[][]dp){
        if(j==0) return 1;
        if(i==0) return 0;
        
        if(dp[i][j]!=-1) return dp[i][j];

        if(s.charAt(i-1)==t.charAt(j-1)){
            return dp[i][j] = distinct(i-1,j-1,s,t,dp) + distinct(i-1,j,s,t,dp);
        }

        return dp[i][j] = distinct(i-1,j,s,t,dp);
    }
    public int numDistinct(String s, String t) {
        int [][] dp = new int[s.length()+1][t.length()+1];

        for(int arr[]:dp){
            Arrays.fill(arr,-1);
        }

        return distinct(s.length(),t.length(),s,t,dp);
    }
}