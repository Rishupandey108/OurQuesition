class Solution {
    public int minMoves(int[] nums) {
        
         int maxvalue = Integer.MIN_VALUE;

         for(int a:nums){
            maxvalue = Math.max(maxvalue,a);
         }


        int result =0;

        for(int a:nums){
            result += maxvalue-a;
        }

        return result;
    }
}