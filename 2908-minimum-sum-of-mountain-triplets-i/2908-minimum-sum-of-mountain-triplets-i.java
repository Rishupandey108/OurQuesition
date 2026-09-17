class Solution {
    public int minimumSum(int[] nums) {
        
        int result = Integer.MAX_VALUE;
        int value =Integer.MAX_VALUE;

        for(int i=0;i<nums.length;i++){

            for(int j=i+1;j<nums.length;j++){

                for(int k=j+1;k<nums.length;k++){

                    if(nums[i]<nums[j] && nums[k]<nums[j]){

                       if(nums[i]+nums[j]+nums[k]<value){
                            result = Math.min(nums[i]+nums[j]+nums[k],result);
                            value = (nums[i]+nums[j]+nums[k]);
                       }
                    }
                }
            }
        }

        return result==Integer.MAX_VALUE?-1:result;
    }
}