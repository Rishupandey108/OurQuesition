class Solution {
    public int sumCounts(List<Integer> nums) {
        int result = 0;

        int size = nums.size();

        for(int i=0;i<size;i++){

                HashSet<Integer> hst  =new HashSet<>();

            for(int j=i;j<size;j++){

                hst.add(nums.get(j));

                result += Math.pow(hst.size(),2);

            }
        }

        return result;
    }
}