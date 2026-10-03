class Solution {
    public int arrangeCoins(int n) {

        if(n==1) return 1;
        if(n==0) return 0;
        
        int temp = n;

        for(int i=0;i<temp;++i){
            if(i<n){
                n-=i;
            }
             if(i+1>n){
                return i;
            }

        }

        return 0;
    }
}