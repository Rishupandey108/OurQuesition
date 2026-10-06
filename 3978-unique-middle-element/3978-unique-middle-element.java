class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
         HashMap<Integer,Integer> hsmp = new HashMap<>();

         for(int a:nums){
            hsmp.put(a,hsmp.getOrDefault(a,0)+1);
         }

         int middle = nums.length/2;

         return hsmp.get(nums[middle])==1;
    }
}