class Solution {
    public long maxPairStrength(int[] nums) {
        
        long result =0;

        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){

                long val = (long)gcd(nums[i],nums[j]);

                 long res = (nums[i]/val)*(nums[j]/val);

                 if(res>result){
                    result=res;
                 }

                  
            }
        }

        return result;
    }


    public long gcd(int a ,int b){
        return b==0?a:gcd(b,a%b);
    }
}