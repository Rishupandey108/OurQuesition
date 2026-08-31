class Solution {
    public int countTriplets(int[] arr) {
        int result =0;

        for(int i=0;i<arr.length;i++){
            
            int first =0;

            for(int j=i+1;j<arr.length;j++){
                first ^=arr[j-1];
                int second = 0;

                for(int k=j;k<arr.length;k++){
                    second^=arr[k];

                    if(first==second){
                        result+=1;
                    }
                }
            }
        }

        return result;
    }
}