class Solution {
    public int convertTime(String current, String correct) {
        
       int result = 0;
	 
	  int  currhr = Integer.parseInt(current.substring(0,2))*60;
        int currmin = Integer.parseInt(current.substring(3));

        int correcthr = Integer.parseInt(correct.substring(0,2))*60;
        int correctmin = Integer.parseInt(correct.substring(3));

        int currentTime = currhr + currmin;
        int correctTime = correcthr + correctmin;
        
        

         int Totaldiff = correctTime-currentTime;
         
         result += Totaldiff/60;
         
         Totaldiff = Totaldiff%60;
         
         result += Totaldiff/15;
         
         Totaldiff = Totaldiff%15;
         
         result += Totaldiff/5;
         
         Totaldiff = Totaldiff%5;
         
         
         result += Totaldiff;
         return result;
    }
}