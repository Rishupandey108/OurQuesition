class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        
        int n = nums.length;
        int prefix[] = new int[n];
        int sufix[] = new int[n];
        int result[] = new int[n];

        prefix[0] = nums[0];
        sufix[n-1] = nums[n-1];

        for(int i=1;i<n;++i){

                prefix[i] =prefix[i-1]+nums[i];
                sufix[n-i-1] = sufix[n-i]+nums[n-i-1];
        }



        for(int i=0;i<nums.length;++i){

            int value = (((nums[i]*i) - prefix[i]) + (sufix[i] - (nums[i]*(n-i-1))));
            result[i] = value;
        }

        return result;
    }
}