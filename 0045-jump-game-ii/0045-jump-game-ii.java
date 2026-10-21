class Solution {
    public int jump(int[] nums) {
        
        int control =0;
        int count =0;
        int currentend =0;

        for(int i=0;i<nums.length-1;i++){

            control = Math.max(control,i+nums[i]);
            
            if(i==currentend){
                count+=1;
                currentend = control;
            }

        }
        return count;
    }
}