class Solution {
    public int missingInteger(int[] nums) {

        boolean bl[] = new boolean[52];

        for(int i=0;i<nums.length;i++) bl[nums[i]]=true;

        int sum = nums[0];

        for(int i=1;i<nums.length;i++){
            if(nums[i]==(nums[i-1]+1))
                sum+=nums[i];
            
            else
            break;
        }

        if(sum>50) return sum;

        for(int i=sum;i<=52;i++){
            if(!bl[i]) return i;
        }

        return 0;
        
    }
}