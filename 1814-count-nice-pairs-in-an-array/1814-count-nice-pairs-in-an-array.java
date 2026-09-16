class Solution {
    public int countNicePairs(int[] nums) {
        long result =0;
        long mod = 1_000_000_007;     

        for(int i=0;i<nums.length;i++){
             nums[i] = nums[i]-reverse(nums[i]);
        }

         Arrays.sort(nums);

         for(int i=0;i<nums.length-1;i++){
                long count =1;
            while(i<nums.length-1&& nums[i]==nums[i+1]){
                count++;
                i++;
            }

            result = (result%mod+(count*(count-1)/2))%mod;
         }


        return (int)(result%mod);

        
    }
    public int reverse(int num){
        int n =0;

        while(num>0){

            int tem = num%10;
            n = n*10+tem;
            num/=10;
        }
        return n;

    }

}