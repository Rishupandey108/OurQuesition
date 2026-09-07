class Solution {

    int MOD =(int) 1e9+7;
    public int distinctSubseqII(String s) {
        
        int dp[] = new int[s.length()];

        Arrays.fill(dp,1);
        int result =0;

        for(int i=0;i<s.length();i++){
            for(int j=0;j<i;j++){

                if(s.charAt(i)!=s.charAt(j)){
                    dp[i] = (int) ((dp[i]+(long)dp[j])%MOD);
                }
            }

    

            result =(int) ((result + (long)dp[i])%MOD);
        }

        return result;
    }
}