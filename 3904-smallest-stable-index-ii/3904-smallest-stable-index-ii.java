class Solution {
    public int firstStableIndex(int[] nums, int k) {
        

        int max =Integer.MIN_VALUE;
        int data =0,index =0;

        for(int i=0;i<nums.length;i++){

            max = Math.max(max,nums[i]);

            if(index == i)
                data = max;
            

            if(nums[i]<data-k)
                index=i+1;
            

        }
        

        return index<nums.length?index:-1;
    }
}