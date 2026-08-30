class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);

        int me = 0;

        for(int i=piles.length/3;i<piles.length;i+=2){
            me+=piles[i];
        }
        return me;
    }
}