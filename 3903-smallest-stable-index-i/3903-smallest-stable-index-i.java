 class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        
        int minarr[] = new int[n];

        int mint=Integer.MAX_VALUE;
        for(int i=n-1;i>=0;i--){
            if(nums[i]<mint) mint=nums[i];
            minarr[i]=mint;
        }

        int max=0;
        for(int i=0;i<n;i++){
            if(nums[i]>max) max=nums[i];
            if(max-minarr[i]<=k) return i;
        }
    return -1;
}
    }

     
