class Solution {
    public int minEatingSpeed(int[] piles, int h) {
          long low = 1;
          long high = 0;

          for(int a:piles){
             high = Math.max(high,a);
          }

        while(low<=high){

            long mid = (low+high)/2;
            long totalcount = 0;

            for(int a:piles){
                totalcount+= (a+(long)mid-1)/mid;    
            }

                 if(totalcount<=h){
                high=mid-1;
            }else{
                low = mid+1;
            }
        }

        return (int)low;
    }       
    }
    