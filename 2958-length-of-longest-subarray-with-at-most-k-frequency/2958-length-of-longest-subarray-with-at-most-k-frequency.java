class Solution {
    public int maxSubarrayLength(int[] nums, int k) {

      HashMap<Integer,Integer> hsmp = new HashMap<>();

     int front =0,next=0,result=0;

     while(next<nums.length){

            hsmp.put(nums[next],hsmp.getOrDefault(nums[next],0)+1);

            while(hsmp.get(nums[next])>k){

                hsmp.put(nums[front],hsmp.get(nums[front])-1);

                front++;
            }

            result = Math.max(result,next-front+1);

            next++;
     }

        return result;


    }
}