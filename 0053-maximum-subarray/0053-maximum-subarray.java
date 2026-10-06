class Solution {
    public int maxSubArray(int[] nums) {
        int result=nums[0];
        int temp = 0;
        int left =0;

        while(left<nums.length){

           temp = temp<=0?0+nums[left]:temp+nums[left];
            result =Math.max(result,temp);

            left++;
        }
        return result;
    }
}