class Solution {
    public int hIndex(int[] c) {
        int n = c.length;

        int[] bucket = new int[n+1];

        for(int a:c){
            if(a>=n){
                bucket[n]++;
            }else{
                bucket[a]++;
            }
        }
        int count =0;
        for(int i=n;i>=0;i--){

            count += bucket[i];

            if(count>=i){
                return i;
            }

        }
        return 0;
    }
}