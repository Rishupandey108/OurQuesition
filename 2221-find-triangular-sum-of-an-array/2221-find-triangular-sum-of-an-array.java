class Solution {
    public int triangularSum(int[] nums) {
        

        if(nums.length==1) return nums[0]%10;
         while(nums[1]!=-1){

                trisum(nums);
         }

        return nums[0];
    }

    public static void trisum(int[]sum){

            int j=0;
            for(int i=1;i<sum.length && sum[i]!=-1;i++){

                    int temp = sum[i]+sum[i-1];

                    sum[j++] = temp%10;

            }

            Arrays.fill(sum,j,sum.length,-1);

    }
}