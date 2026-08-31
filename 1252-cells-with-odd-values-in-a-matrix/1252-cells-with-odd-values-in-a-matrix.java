class Solution {
    public int oddCells(int m, int n, int[][] indices) {
       
       int [][] arr = new int[m][n];
        

        for(int a[]:indices){

            for(int i=0;i<n;i++){
                arr[a[0]][i] = arr[a[0]][i]+1;
            }

            for(int i=0;i<m;i++){
                arr[i][a[1]] = arr[i][a[1]]+1;
            }
        }


        int result =0;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]%2!=0){
                    result+=1;
                }
            }
        }

        return result;
       
    }
}