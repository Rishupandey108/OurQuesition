class Solution {
    public int maxChunksToSorted(int[] arr) {
          int result =0,currsum=0,totalsum =0;

          for(int i=0;i<arr.length;i++){
                currsum += i;
                totalsum += arr[i];
                if(currsum == totalsum){
                    result+=1;
                }
          }

         return result;
    }
}