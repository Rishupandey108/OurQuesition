class Solution {
    static final long MOD = 1_000_000_007;
    public int countGoodNumbers(long n) {
        
        long e = (n+1)/2;
        long o = n/2;

        long pow5 = modPow(5,e);
        long pow4 = modPow(4,o);

        return (int)((pow5*pow4)%MOD);
    }


    public static long modPow(long base,long exp){
        base %=MOD;

       long result = 1;

        while(exp>0){

            if(exp%2==1) result = (result*base)%MOD;

            base = (base*base)%MOD;

            exp/=2;
        }

        return result;
    }
}