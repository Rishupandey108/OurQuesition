class Solution {
    public boolean mergeTriplets(int[][] triplets, int[] target) {

        int x = target[0];
        int y = target[1];
        int z = target[2];

        boolean flagx = false,flagy = false, flagz=false;


        for(int arr[]:triplets){

            
            if(arr[0]>x || arr[1]>y || arr[2]>z){
                continue;
            }
            if(arr[0]==x){
                flagx = true;
            } 

            if(arr[1]==y){
                flagy = true;
            } 

            if(arr[2]==z){
                flagz = true;
            } 
        }

        return  flagx & flagy & flagz;
    }
}