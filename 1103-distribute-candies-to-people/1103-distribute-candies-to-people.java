class Solution {
    public int[] distributeCandies(int candies, int num_people) {

        int arr[] = new int[num_people];
        int i =1;

        
        while(i<candies){

            for(int j=0;j<arr.length;j++){
                     if(i<candies){
                        arr[j] +=i;
                        candies-=i;
                        i++;
                     }else if(candies>0 && candies<i){
                            arr[j] += candies;
                            candies=0;
                            break;
                     }else{
                        break;
                     }
            }

        }

        arr[0] += candies;

        return arr;
        
    }

}