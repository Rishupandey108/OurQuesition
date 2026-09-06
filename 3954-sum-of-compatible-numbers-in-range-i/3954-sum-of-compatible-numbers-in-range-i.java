class Solution {
    public int sumOfGoodIntegers(int n, int k) {
        
        int start = Math.max(1,n-k);
        int end = n+k;
        int dp[] = new int[n+k+1];
        
        int result =0;

        int prev = Math.abs(n-start)<=k && (n&start)==0?start:0;

        for(int i=start+1;i<=n+k;i++){
        
            if(Math.abs(n-i)<=k &&  (n&i)==0){
                result = prev + i;
                prev = result;
            }else{
                 result = prev;
            }
              
        }

        return result;
    }
}