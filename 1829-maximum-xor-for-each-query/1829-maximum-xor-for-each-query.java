class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        
        int k = (int)Math.pow(2,maximumBit)-1;
        

        int [] result = new int[nums.length];
        int n = nums.length;

        for(int i=0;i<nums.length;i++){

            k ^=nums[i];
            result[n-i-1] = k;
        }

        return result;
    }
}