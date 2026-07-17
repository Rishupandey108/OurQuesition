class Solution {
    public int maxJump(int[] stones) {
        
        int dp[] = new int[stones.length+1];

        dp[0] = stones[0];
        dp[1] = Math.max(stones[0],stones[1]);

        for(int i=2;i<stones.length;i++){
            int curr = Math.max(dp[i-1],stones[i]-stones[i-2]);

            dp[i] = curr;
        }

        return dp[stones.length-1];
    }
}