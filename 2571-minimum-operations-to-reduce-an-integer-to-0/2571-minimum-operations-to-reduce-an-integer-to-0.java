class Solution {
    public int minOperations(int n) {
        
       int result = 0;

       while(n>0){

        result+=1;

        double log = Math.log(n)/Math.log(2);

        int present =(int) Math.pow(2,(int)(log));
        int next = (int)Math.pow(2,(int)(log+1));

        int differ1 = n-present;
        int differ2 = next - n;

        if(differ1<differ2) n = differ1;
        else n = differ2;

       }

       return result;
    }
}