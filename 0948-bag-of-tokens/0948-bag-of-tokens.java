class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        int result = 0;
        int n = tokens.length;

        Arrays.sort(tokens);

        if(n==0 || tokens[0]>power) return 0;

        int j=0;

         for(int i=0;i<n-j;i++){

            if(tokens[i]>power){
                ++j;
                power+= tokens[n-j];
                if(result>0){
                    result-=1;
                }
            }

            if(tokens[i]<=power){
                    result+=1;
                    power-=tokens[i];
            }
         }
        
        return result;
    }
}