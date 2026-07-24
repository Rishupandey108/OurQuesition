class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
       nums[0]  = nums[0]==target?1:-1;

       for(int i=1;i<nums.length;i++){
            nums[i] = nums[i-1]+(nums[i]==target?1:-1);
       }


       int result =0;

       for(int val : nums){
        if(val>0){
            result++;
        }
       }

       for(int i=1;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                if((nums[j]-nums[i-1])>0){
                    result++;
                }
            }
       }

       return result;
    }
}