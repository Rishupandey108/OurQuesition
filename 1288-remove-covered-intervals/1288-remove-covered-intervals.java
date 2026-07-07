class Solution {
    public int removeCoveredIntervals(int[][] intervals) { 

        int result =0;
         
        for(int i=0;i<intervals.length;i++){
            if(checkinterval(intervals[i][0],intervals[i][1],intervals,i)){
                result++; 
            }
        }
        
        return  intervals.length - result;
    }


    public static boolean checkinterval(int a , int b ,int[][]arr,int n){
        for(int i=0;i<arr.length;i++){

                if(i==n){
                    continue;
                } else if(arr[i][0]<=a && b<=arr[i][1]){
                        return true;
                }
        }
        return false;
    }
}