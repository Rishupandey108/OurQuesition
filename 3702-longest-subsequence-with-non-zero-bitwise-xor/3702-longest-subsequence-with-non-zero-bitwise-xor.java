class Solution {
    public int longestSubsequence(int[] nums) {

       int n = nums.length;
       int count = 0;
       int zeros =0;

       for(int a:nums){
            count ^= a;
            if(a==0) zeros++;
       } 

       if(count!=0) return n;
        if(zeros==n) return 0;
       if(count ==0) return n-1;

       return 0;
    }
}