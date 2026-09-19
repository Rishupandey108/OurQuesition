class Solution {
    public int findPairs(int[] nums, int k) {
        
        int result=0;
        HashMap<Integer,Integer> hsmp = new HashMap<>();

        for(int a:nums){
            hsmp.put(a,hsmp.getOrDefault(a,0)+1);
        }

        for(int key :hsmp.keySet()){

            if(k!=0 && hsmp.containsKey(key+k) || k==0 && hsmp.get(key)>1){
                result++;
            }
        }

       return  result;
    }
}