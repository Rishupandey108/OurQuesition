class Solution {
    public int minOperations(int[] nums, int x) {
        
        HashMap<Integer,Integer> hsmp = new HashMap<>();
        int sum =0;
        hsmp.put(0,-1);

        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            hsmp.put(sum,i);
        }

        if(sum<x){
            return -1;
        }

        int avail = sum - x;
        int totindex = Integer.MIN_VALUE;
        
         sum =0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];

            int findsum = sum-avail;

                if(hsmp.containsKey(findsum)){

                    int n = hsmp.get(findsum);
                         totindex = Math.max(totindex,i-n);

                }
               
        }

        return totindex==Integer.MIN_VALUE?-1:nums.length-totindex;
    }
}