class Solution {
    public int minOperations(int[] nums, int k) {
        
        int sum =0;

        for(int a:nums){
            sum+=a;
        }

        if(sum<k) return sum;

        return sum%k;
    }
}