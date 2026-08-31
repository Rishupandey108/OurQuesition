class Solution {
    public int triangularSum(int[] nums) {
        
            int val = nums.length;

        if(nums.length==1) return nums[0]%10;
         while(val !=1){

               val =  trisum(nums,val);
         }

        return nums[0];
    }

    public static int trisum(int[]sum,int val){

            int j=0;
            for(int i=1;i<val && sum[i]!=-1;i++){

                    int temp = sum[i]+sum[i-1];

                    sum[j++] = temp%10;

            }

            // Arrays.fill(sum,j,sum.length,-1);

            return j;

    }
}