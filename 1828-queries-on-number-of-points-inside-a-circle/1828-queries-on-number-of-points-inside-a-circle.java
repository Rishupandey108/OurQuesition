class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        int result[] = new int[queries.length];
        int j =0;

        for(int i=0;i<queries.length;i++){

             
            int count =0;

            for(int arr[]:points){

                  //Eculidian 
                  int x1 = (queries[i][0] - arr[0]) * (queries[i][0]-arr[0]);
                  int x2 = (queries[i][1] - arr[1]) * (queries[i][1] - arr[1]);

                   
                double  temp =  Math.sqrt(x1+x2);

                 if((temp*temp)<=(queries[i][2]*queries[i][2])){
                    count+=1;
                 } 
            }

            result[i] = count;


        }
        return result;
    }
}