class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {

        int smallTime =landStartTime[0]+landDuration[0];
        int small = Integer.MAX_VALUE;
        
         
         for(int i=0;i<landStartTime.length;i++){
             smallTime= Math.min(landStartTime[i]+landDuration[i],smallTime);
         }
        

        
       for(int i=0;i<waterStartTime.length;i++){
             small = Math.min(small,waterDuration[i]+Math.max(smallTime,waterStartTime[i]));
       }

        smallTime = Integer.MAX_VALUE;

       for(int i=0;i<waterStartTime.length;i++){  
            smallTime = Math.min(waterStartTime[i]+waterDuration[i],smallTime);
        }

         for(int i=0;i<landDuration.length;i++){
            small = Math.min(small,landDuration[i]+Math.max(smallTime,landStartTime[i]));
         }

        return small;

    }
}