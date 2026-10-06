class Solution {
    public int minAbsoluteDifference(int[] nums) {
        
        int result = Integer.MAX_VALUE;
        int n = nums.length;

        for(int i=0;i<n;i++){

            for(int j=0;j<n;j++){
                if(nums[i]==1 && nums[j]==2){
                    result = Math.min(Math.abs(i-j),result);
                }
            }
        }

        return result==Integer.MAX_VALUE?-1:result;
        
    }
}