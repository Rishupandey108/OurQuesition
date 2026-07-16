class Solution {
    public double minimumAverage(int[] nums) {
       double result =Integer.MAX_VALUE;
        Arrays.sort(nums);

        int left =0;
        int right = nums.length-1;

        while(left<right){
            result = Math.min(result,(double)(nums[left]+nums[right])/2);
            left++;
            right--;
        }
        return result;
    }
}