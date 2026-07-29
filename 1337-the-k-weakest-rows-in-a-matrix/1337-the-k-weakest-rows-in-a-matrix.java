class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
         

        int arr[][]  = new int[mat.length][2];

        for(int i=0;i<mat.length;i++){
            int count=0;
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1){
                    count++;
                }
            }

            arr[i][0] = count;
            arr[i][1] = i;
        }

         Arrays.sort(arr,(a,b)->
         {
            if(a[0]==b[0])
            return Integer.compare(a[1],b[1]);
            else
            return Integer.compare(a[0],b[0]);
         });


        int [] result = new int[k];
        
        for(int i=0;i<k;i++){
            result[i] = arr[i][1];
        }

        return result;
    }
}