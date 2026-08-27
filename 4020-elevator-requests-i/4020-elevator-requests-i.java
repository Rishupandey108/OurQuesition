class Solution {
    public int elevatorRequests(int n, int[] requests) {
       int prev =0;

       int result =0;


       for(int a:requests){

            result += Math.abs(a-prev);
            prev = a;
       } 

       return result;
    }
}