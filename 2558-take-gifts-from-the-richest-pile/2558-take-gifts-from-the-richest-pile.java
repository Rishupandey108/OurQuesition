class Solution {
    public static long pickGifts(int[] gifts, int k) {
         long result =0;
        int len = gifts.length-1;
        Arrays.sort(gifts);
            
        // for(int i=gifts.length-1;i>=0;i--){

        //             if(k>0){
        //                 result+=(long)Math.floor(Math.sqrt(gifts[i]));
        //                 k-=1;
        //             }else{
        //                 result+=gifts[i];
        //             }
            
        // }
       for(int i=0;i<k;i++){
        Arrays.sort(gifts);
        gifts[len] =  (int)Math.floor(Math.sqrt(gifts[len]));
       }

       for(int x:gifts){
        result +=x;
       }
       return result;
    }
}