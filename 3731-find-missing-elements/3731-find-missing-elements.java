class Solution {
    public List<Integer> findMissingElements(int[] nums) {
       List<Integer> lst = new ArrayList<>();
       HashSet<Integer> hst = new HashSet<>();

       int min = Integer.MAX_VALUE;
       int max = Integer.MIN_VALUE;
       for(int a:nums){
        min = Math.min(min,a);
        max = Math.max(max,a);
        hst.add(a);
       }

       for(int i=min;i<=max;i++){
        if(hst.add(i)){
            lst.add(i);
        }
       }
       return lst;
    }
}