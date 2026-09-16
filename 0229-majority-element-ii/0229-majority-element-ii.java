class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> hsmp = new HashMap<>();

        for(int a:nums){
            hsmp.put(a,hsmp.getOrDefault(a,0)+1);
        }

        List<Integer> lst = new ArrayList<>();

        for(int key:hsmp.keySet()){
            if(hsmp.get(key)>nums.length/3){
                lst.add(key);
            }
        }

        return lst;
    }
}