class Solution {
    public List<Integer> findValidElements(int[] nums) {
        List<Integer> lst = new ArrayList<>();

        if(nums.length<=1){
             lst.add(nums[0]);
             return lst;
        }

        lst.add(nums[0]);
       
       int left = nums[0];
       

        for(int i=1;i<nums.length-1;i++){
            int right = Integer.MIN_VALUE;

            if(nums[i]>left){
                lst.add(nums[i]);
            }else{

                for(int j=i+1;j<nums.length;j++){
                    right = Math.max(right,nums[j]);
                }
                if(nums[i]>right){
                    lst.add(nums[i]);
                }
            }
            left =Math.max(left,nums[i]);
              
        }
         lst.add(nums[nums.length-1]);
        return lst;
    }
}