class KthLargest {

    List<Integer> lst;
    int  k ;

    public KthLargest(int k, int[] nums) {

        lst  = new ArrayList<>();
        this.k = k;

        for(int a:nums){
            lst.add(a);
        }
        Collections.sort(lst);
        
    }
    
    public int add(int val) {
        
        lst.add(val);
        Collections.sort(lst);

        return lst.get(lst.size()-k);
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */