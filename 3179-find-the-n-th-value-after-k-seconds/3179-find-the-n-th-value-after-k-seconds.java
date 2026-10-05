class Solution {
    long M = 1_000_000_007;
    public int valueAfterKSeconds(int n, int k) {
       long arr[] = new long[n];
        Arrays.fill(arr,1);

        while(k-- > 0){

                for(int i=1;i<n;i++){

                        arr[i] = (arr[i]+arr[i-1])%M;
                }
        }

        return (int)(arr[n-1]);
    }
}