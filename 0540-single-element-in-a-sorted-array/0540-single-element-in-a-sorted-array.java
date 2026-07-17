class Solution {
    public int singleNonDuplicate(int[] nums) {
        int i=0,j=0;
            while(i<nums.length && j<nums.length){
                if(nums[i]==nums[j]){
                    j++;
                }else if(nums[i]!=nums[j] && j-i!=1){
                    i=j;
                    j++;
                }else if(nums[i]!=nums[j] && j-i==1){
                    return nums[i];
                }
            }
            return nums[i];
    }
}