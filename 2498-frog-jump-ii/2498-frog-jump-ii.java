class Solution {
    public int maxJump(int[] stones) {
        int n = stones.length;
       int result = Integer.MIN_VALUE;

       if(n==2){
        return Math.abs(stones[1]-stones[0]);
       }

       for(int i=0;i<n-2;i++){
            int cost =  stones[i+2] - stones[i];

            result = Math.max(result,cost);

       }

       return result;
    }
}