class Solution {
    public int smallestNumber(int n, int t) {
            while(find(n)%t!=0){
                n++;
            }
            return n;
    }
    public int find(int n){
        int result = 1;
        while(n!=0){
            result *=n%10;
            n/=10;
        }
        return result;
    }
}