class Solution {
    public int missingMultiple(int[] nums, int k) {
         boolean[] b = new boolean[101];

         for(int i:nums){
            b[i] = true;
         }


         int val = k;

         while(val<101){

            if(!b[val]){
                return val;
            } else{ 
            val+=k;
            }
         }

         return val;
    }
}