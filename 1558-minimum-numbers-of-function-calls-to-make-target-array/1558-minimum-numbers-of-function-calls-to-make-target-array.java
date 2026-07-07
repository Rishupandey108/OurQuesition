class Solution {
    public int minOperations(int[] nums) {
        int result =0;
        int n = nums.length;

        while(true)
        {
            boolean flag = false;
            for(int i=0;i<n;i++){
                if(nums[i]%2!=0){
                    nums[i]--;
                    result++;
                }
            }

            for(int i=0;i<n;i++){
                
                 nums[i]/=2;

                if(nums[i]>0){
                    flag = true;
                }
            }
            result++;

            if(!flag){
                break;
            }
            
        }
        return result-1;

    }
}