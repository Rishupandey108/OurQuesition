class Solution {
    public int minOperations(int[] nums, int k) {
        
        int len = nums.length;
        int result =0;

        for(int a:nums){
            if(a>=k){
                continue;
            }else {
                result+=1;
            }
        }

        return result;
    }
}