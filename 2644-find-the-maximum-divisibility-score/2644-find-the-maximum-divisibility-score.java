class Solution {
    public int maxDivScore(int[] nums, int[] divisors) {
      
    //   Arrays.sort(divisors);
      int result =Integer.MAX_VALUE,value =Integer.MIN_VALUE;

       for(int i=0;i<divisors.length;i++){

            int  count = 0;

            for(int j=0;j<nums.length;j++){

                if(nums[j]%divisors[i]==0){

                    count++;

                }
            }

            
                if(count>value){

                value = count;
                result = divisors[i];

                }else if(count==value){

                    value = count;
                    result = divisors[i]<result?divisors[i]:result;

                }

            

       }
    return result;
    }
}