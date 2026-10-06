class Solution {
    public List<Integer> findValidElements(int[] nums) {
        List<Integer> lst = new ArrayList<>();

        if(nums.length<=1){
             lst.add(nums[0]);
             return lst;
        }

        lst.add(nums[0]);
       

        for(int i=1;i<nums.length-1;i++){

             int left = Integer.MIN_VALUE;
             int right = Integer.MIN_VALUE;

             for(int  j=0;j<i;j++){
                left = Math.max(left,nums[j]);
             }

             for(int j=i+1;j<nums.length;j++){
                right = Math.max(right,nums[j]);
             }

             if(nums[i]>left || nums[i]>right){
                lst.add(nums[i]);
             }
        }
         lst.add(nums[nums.length-1]);
        return lst;
    }
}