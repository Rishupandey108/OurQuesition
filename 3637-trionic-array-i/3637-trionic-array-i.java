class Solution {
    public boolean isTrionic(int[] nums) {
        int n = nums.length;
        int p =n-1;
        int v =0;

        for(int i=0;i<n-1;i++){
            
            if(p==n-1 && nums[i]>=nums[i+1]){
                p = i;
            }

            if(v==0 && nums[n-1-i]<=nums[n-2-i]){
                v = n-1-i;
            }

            if(p<v){
                return isDecreasing(nums,p,v);
            }
                
        }
        return false;
    }

    public boolean isDecreasing(int[]nums,int x , int y){

        if(x==0 || y==nums.length-1){
            return false;
        }
        for(int i=x;i<y;i++){
            if(nums[i]<=nums[i+1]){
                return false;
            }
        }

        return true;
    }
}