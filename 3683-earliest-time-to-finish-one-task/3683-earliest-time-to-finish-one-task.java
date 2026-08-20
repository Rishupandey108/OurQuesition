class Solution {
    public int earliestTime(int[][] tasks) {

       int result = Integer.MAX_VALUE;

       for(int a[]:tasks){

            result = Math.min(result,a[0]+a[1]);
       } 

       return result;
    }
}