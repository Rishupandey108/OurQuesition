class Solution {
    public int distinctAverages(int[] nums) {
       Arrays.sort(nums);

       HashSet<Double> hst = new HashSet<>();

       int left = 0;
       int right = nums.length-1;

       while(left<=right){

             double temp = (double)(nums[left]+nums[right])/2;
            hst.add(temp);
            left++;
            right--;
       }

       return hst.size(); 
    }
}