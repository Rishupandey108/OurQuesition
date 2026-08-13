class Solution {
    public int countValidSelections(int[] nums) {
        
        int sum =0,result = 0;
        int left=0;

        for(int a:nums){
            sum+=a;
        }

        for(int i=0;i<nums.length;i++){

            left+=nums[i];
            sum-=nums[i];

            if(nums[i]!=0) continue;
            if(left==sum) result+=2;
            if(Math.abs(left-sum)==1)  result+=1;
            
        }
            return result;
    }
}