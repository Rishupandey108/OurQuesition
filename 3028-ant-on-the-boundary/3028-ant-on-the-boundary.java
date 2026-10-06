class Solution {
    public int returnToBoundaryCount(int[] nums) {

       int sum =0;
       int result =0;

       for(int a:nums){

            sum+=a;
            if(sum==0){
                result+=1;
            }
       }

        return result;
    }
}