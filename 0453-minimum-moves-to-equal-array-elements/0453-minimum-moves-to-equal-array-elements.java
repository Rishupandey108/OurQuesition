class Solution {
    public int minMoves(int[] nums) {
        int total = 0;
        int min =Integer.MAX_VALUE;

        for(int a:nums){
                min = Math.min(a,min);
        }

        for(int a:nums){
            total+=a;
        }
        
        return total-(min*nums.length);
    }
}