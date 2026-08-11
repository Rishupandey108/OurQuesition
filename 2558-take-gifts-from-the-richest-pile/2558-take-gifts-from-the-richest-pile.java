class Solution {
    public static long pickGifts(int[] gifts, int k) {
         long result =0;

        int len = gifts.length-1;
            
         
       for(int i=0;i<k;i++){
        
        int max = 0;
        for(int j=0;j<gifts.length;j++){
                if(gifts[j]>=gifts[max]){
                    max = j;
                }
         }
            
         gifts[max] = (int)(Math.floor(Math.sqrt(gifts[max])));
       }

       for(int x:gifts){
        result +=x;
       }
       return result;
    }
}