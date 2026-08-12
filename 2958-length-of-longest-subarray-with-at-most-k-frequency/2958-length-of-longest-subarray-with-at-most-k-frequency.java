class Solution {
    public int maxSubarrayLength(int[] nums, int k) {

      HashMap<Integer,Integer> hsmp = new HashMap<>();

      int  maxsum =0;
      int left = 0;

     for(int i=0;i<nums.length;i++){

            hsmp.put(nums[i],hsmp.getOrDefault(nums[i],0)+1);

            while(hsmp.get(nums[i])>k){
                hsmp.put(nums[left],hsmp.get(nums[left])-1);
                left++;
            }

            maxsum = Math.max(maxsum,i-left+1);
     } 

     return maxsum;

    }
}