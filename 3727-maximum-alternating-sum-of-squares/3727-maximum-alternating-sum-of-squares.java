class Solution {
    public long maxAlternatingSum(int[] nums) {
        
        for(int i=0;i<nums.length;i++){
            nums[i] = nums[i]*nums[i];
        }
        int n = nums.length;

        Arrays.sort(nums);
        long result = n%2==0?0:nums[n-1];

        int left = 0;
        int right = n%2==0?n-1:n-2;

        while(left<right){

            result += (long)(nums[right]);
            result -= (long)(nums[left]);
            left++;
            right--;
        }

         return result;

    }
}