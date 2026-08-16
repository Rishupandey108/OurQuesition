class Solution {
    public boolean stoneGameIX(int[] stones) {
       int zero =0;
       int ones = 0;
       int two = 0;

       for(int a:stones){

        if(a%3==0) zero++;
        if(a%3==1) ones++;
        if(a%3==2) two++;

       }

         if(zero%2==0) return ones>0 && two>0;
         else return Math.abs(ones-two)>2;
    }
}