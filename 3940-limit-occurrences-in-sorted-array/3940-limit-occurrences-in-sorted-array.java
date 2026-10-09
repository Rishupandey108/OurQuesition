class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        int left =0,temp =0,right =0;

         for(left=0;left<nums.length;left++){
            
            if(right<k || nums[left]!=nums[right-k]){
                nums[right] = nums[left];
                right++;
            }

         }

        return Arrays.copyOf(nums,right);

         
    }
}