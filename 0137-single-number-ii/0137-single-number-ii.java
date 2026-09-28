class Solution {
    public int singleNumber(int[] nums) {
        
        int result =0;

      for(int i=0;i<32;i++){
        
        int sum =0;
        int bitmask = 1<<i;
        for(int j=0;j<nums.length;j++){

                if(((nums[j]>>i)&1)==1){
                    sum+=1;
                    sum%=3;
                }
        }

        if(sum!=0){
           result |=  sum<<i;
        }
      }

      return result;

    }
}