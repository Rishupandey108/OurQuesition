class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        long  val = (long) cost1*need1 + (long)cost2*need2;

        long calculate = (long)costBoth*Math.max(need1,need2);

         if(need1>need2){
                long whenfirst = (long)need2*costBoth + (long)(need1-need2)*cost1;
                calculate =   Math.min(calculate,whenfirst);
         }else{
            long whensecond = (long)need1*costBoth +(long) (need2-need1)*cost2;
            calculate =  Math.min(calculate,whensecond);
         }


        return   Math.min(val,calculate);
    }
}