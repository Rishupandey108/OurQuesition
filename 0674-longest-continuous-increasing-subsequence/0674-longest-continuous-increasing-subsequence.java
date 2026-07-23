class Solution {
    public int findLengthOfLCIS(int[] nums) {

       int result =0;

        int curr = 0;
       for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                continue;
            }else{
                result = Math.max((i-curr),result);
                curr = i;
                
            }
       }

       result = Math.max(result,nums.length-curr);

       return result;

    }
}