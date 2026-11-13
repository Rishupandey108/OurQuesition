class Solution {
    public double largestSumOfAverages(int[] nums, int k) {
        int n = nums.length;

        Double [][]dp = new Double[n][k];

        return  AverageCal(nums,0,n,k-1,dp);
    }


    private double AverageCal(int[] nums,int start , int end , int k , Double[][]dp){
            if(start>=end) return 0;

            if(dp[start][k]!=null) return dp[start][k];

            if(k==0){
                double lastpartioning = 0;

                for(int i=start;i<end;i++){
                    lastpartioning += nums[i];
                }

                return lastpartioning /(end-start);
            }

            double max =0;

            for(int i=start+1;i<end ;i++){

                double res = AverageCal(nums,i,end,k-1,dp);

                double Currentpartioning = 0;

                for(int j=start;j<i;j++){
                    Currentpartioning += nums[j];
                }

                double avg = Currentpartioning/(i-start);

                max  = Math.max(max , avg+res);
            }

            dp[start][k] = max;
            return max;
    }
}