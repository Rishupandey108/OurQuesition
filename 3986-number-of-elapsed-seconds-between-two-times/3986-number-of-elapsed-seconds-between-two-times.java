class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        
        int SH = Integer.parseInt(startTime.substring(0,2));
        int SM = Integer.parseInt(startTime.substring(3,5));
        int SS = Integer.parseInt(startTime.substring(6,8));

        int EH = Integer.parseInt(endTime.substring(0,2));
        int EM = Integer.parseInt(endTime.substring(3,5));
        int ES = Integer.parseInt(endTime.substring(6,8));

         int TotalStartTime = SH*3600 + SM * 60+SS;
         int TotalEndTime = EH*3600 + EM * 60 +ES;

         return TotalEndTime-TotalStartTime;
    }
}