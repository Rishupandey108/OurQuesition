class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        int tempsum =0;

        for(int i=0;i<k;i++){
            tempsum+=nums[i];
        }
        
        int result = tempsum;

        for(int i=k;i<nums.length;i++){
            tempsum = tempsum + nums[i]-nums[i-k];
            result = Math.max(tempsum,result);
        }

        return (double)result/k;
    }
}