class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashMap<Integer,Integer> hsmp = new HashMap<>();

        for(int a:nums){
            hsmp.put(a,hsmp.getOrDefault(a,0)+1);
        }

        int i = 0;
        for(int a:hsmp.keySet()){
            if(hsmp.get(a)==2){
                nums[i]=a;
                i++;
            }
        }

        return Arrays.copyOf(nums,2);
    }
}