class Solution {
    public int[] concatWithReverse(int[] nums) {
        int [] result = new int[nums.length*2];
        int n = nums.length;

        for(int i=0;i<nums.length;i++){
            result[i] = nums[i];
            result[n+i] = nums[n-i-1];
        }

        return result;
    }
}