class Solution {

    public int longestMonotonicSubarray(int[] nums) {
         if(nums.length==1) return 1;
        Stack<Integer> inc = new Stack<>();
        Stack<Integer> dec =new Stack<>();
        int result = 0;

         for(int i=1;i<nums.length;i++){

            if(nums[i-1]<nums[i]){
                inc.push(nums[i]);
                dec.clear();
            }else if(nums[i-1]>nums[i]){
                dec.push(nums[i]);
                inc.clear();
            }else{
                inc.clear();
                dec.clear();
            }

            result = Math.max(result,Math.max(dec.size(),inc.size()));
         }

          return result+1;
    }
}