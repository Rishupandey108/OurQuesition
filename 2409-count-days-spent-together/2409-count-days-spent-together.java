class Solution {
    int arr[] =  {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
         

         int  Alicestart = getTotalDays(arriveAlice);
         int AliceLeave = getTotalDays(leaveAlice);

         int BobStart = getTotalDays(arriveBob);
         int BobLeave = getTotalDays(leaveBob);

         int start= Math.max(Alicestart,BobStart);
         int end = Math.min(AliceLeave,BobLeave);

         if(start>end){
            return 0;
         }

         return end - start+1;

    }

    public int getTotalDays(String s){

        int month= Integer.parseInt(s.substring(0,2));
         int day = Integer.parseInt(s.substring(3,5));
         int result =0;

         for(int i=0;i<month-1;i++){
                result+=arr[i];
         }

         result+=day;

         return result;
    }
}