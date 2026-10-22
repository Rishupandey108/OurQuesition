class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        int result = 0;
        int n = tokens.length;

        Arrays.sort(tokens);

        if(n==0 || tokens[0]>power) return 0;

        int j=n;
        int i=0;

        while(i<j){

            if(tokens[i]>power){

                --j;
                power+= tokens[j];

                if(result>0){

                    result-=1;

                }
            }

            if(tokens[i]<=power){

                    result+=1;

                    power-=tokens[i];
            }
            i++;
         }
        
        return result;
    }
}