class Solution {
    public long minCuttingCost(int n, int m, int k) {
        
        long cost = n<=k?0:(long)k * (n-k);
        cost += m<=k?0:(long)k *(m-k);

        return cost;
    }
}