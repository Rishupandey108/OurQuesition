class Solution {
    public int largestInteger(int[] nums, int k) {

            int [] freq = new int[51];

            for(int a:nums){
                freq[a]++;
            }

            int result = -1;
            int n = nums.length;

            for(int i=0;i<n;i++){
                if(k==n || (freq[nums[i]]==1 && (k==1 || i==0 ||i==n-1))){
                    result = Math.max(result,nums[i]);
                }
            }

            return result;
    }
}