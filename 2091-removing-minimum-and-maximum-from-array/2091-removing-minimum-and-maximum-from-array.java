class Solution {
    public int minimumDeletions(int[] nums) {
        
        int minind=0,maxind =0;

        int n = nums.length;


        for(int i=1;i<nums.length;i++){

            if(nums[i]<nums[minind]){
                 minind = i;
                
            }

            if(nums[i]>nums[maxind]){
                 maxind =i;
            }
        }



       if(minind>maxind){

            minind = (maxind+minind) - (maxind = minind);
       }


        return Math.min(maxind+1,Math.min(n-minind,minind+1+n-maxind));
 
    }
}