class Solution {
    public int arrangeCoins(int n) {

        if(n==1) return 1;
        if(n==0) return 0;
        
            int result =0,i=1;

            while(i<n){

                n-=i;
                 result+=1;

                if(i+1<=n){
                     i++;
                }else {
                    break;
                }
               
            }

            return  i;
    }
}