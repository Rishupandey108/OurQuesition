class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int result[] = new int[nums.size()];

        for(int i=0;i<nums.size();i++){

            int val = nums.get(i);

            if(val%2==0){
                result[i] = -1;
            }else{

                result[i] = val-((val+1)&(-val-1))/2;
            }
        }

        return result;
    }
}