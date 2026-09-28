class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        int result[] = new int[nums.length];

        for(int i=0;i<nums.length;i++){

                HashSet<Integer> prefix = new HashSet<>();
                HashSet<Integer> suffix = new HashSet<>();

                for(int j=0;j<=i;j++){
                    prefix.add(nums[j]);
                }

                for(int j=i+1;j<nums.length;j++){
                    suffix.add(nums[j]);
                }

                result[i] = prefix.size()-suffix.size();
        }


        return result;
    }
}