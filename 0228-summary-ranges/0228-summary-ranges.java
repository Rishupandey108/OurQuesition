class Solution {
    public List<String> summaryRanges(int[] nums) {
       List<String> lst = new ArrayList<>();

        if(nums.length==0){
            return lst;
        }


        int i=0;

        while(i<nums.length){

            int start  = nums[i];

            int j = i;

            while(j+1<nums.length && nums[j+1]==nums[j]+1){
                j++;
            }

            if(start == nums[j]){
                lst.add(String.valueOf(nums[j]));
            }else {
                lst.add(start+"->"+nums[j]);
            }

            i = j+1;
        }

        return lst;
    }
}