class Solution {
    public int semiOrderedPermutation(int[] nums) {
         int n = nums.length;
         int result =0;

         int min=1,max=nums.length;

        
         for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                min= i;
            }else if(nums[i]==nums.length){
                max =i;
            }
         }


        result += Math.abs(0-min);
        result += Math.abs(n-max-1);

        if(max<min){
            result-=1;
        }

        
         return result; 

          
    }
}