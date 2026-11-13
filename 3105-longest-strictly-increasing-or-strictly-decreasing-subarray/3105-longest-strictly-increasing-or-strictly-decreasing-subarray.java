class Solution {

    public int longestMonotonicSubarray(int[] nums) {

       int inc1 =0;
       int inc2=0;
        int result = 0;

         for(int i=1;i<nums.length;i++){

            if(nums[i-1]<nums[i]){
                inc1+=1;
                inc2=0;
            }else if(nums[i-1]>nums[i]){
                 inc2+=1;
                inc1=0;
            }else{
                 inc1=0;
                 inc2=0;
            }

            result = Math.max(result,Math.max(inc1,inc2));
         }

          return result+1;
    }
}