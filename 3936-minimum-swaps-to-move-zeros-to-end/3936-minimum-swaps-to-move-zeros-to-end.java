class Solution {
    public int minimumSwaps(int[] nums) {
        
        int zeros = 0;

        for(int a:nums){
            if(a==0){
                zeros+=1;
            }
        }

      

       for(int i=nums.length-zeros;i<nums.length;i++){

                if(nums[i]==0){
                    zeros-=1;
                }
       }

       return zeros;

    }
}