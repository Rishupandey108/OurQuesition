class Solution {
    public int countSpecialIntegers(int[] nums) {
          HashMap<Integer,Integer> hsmp = new HashMap<>();

          hsmp.put(nums[0],1);
          int count =0;

          for(int i=1;i<nums.length;i++){
                if(nums[i]!=nums[i-1]){
                    hsmp.put(nums[i],hsmp.getOrDefault(nums[i],0)+1);
                }
          }

          for(int val:hsmp.values()){
            if(val==1){
                    count+=1;
            }
          }

          return count;
    }
}