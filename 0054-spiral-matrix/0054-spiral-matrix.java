class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
       ArrayList<Integer> result = new ArrayList<>();

        int n = matrix.length;
        int m = matrix[0].length;


       int left =0 ,right=m-1;

       int top=0,buttom=n-1;


       while(top<=buttom && left<=right){

            // Edhar se udhar 
            for(int i=left;i<=right;i++){
                result.add(matrix[top][i]);
            }
            top++;

            // Uppar se niche
            for(int i=top;i<=buttom;i++){
                result.add(matrix[i][right]);
            }
            right--;


            // udher se idher
            if(top<=buttom){
                for(int i=right;i>=left;i--){
                    result.add(matrix[buttom][i]);
                }
                buttom--;
            }

            // niche se uppar
            if(left<=right){
                for(int i=buttom;i>=top;i--){
                    result.add(matrix[i][left]);
                }
                left++;
            }
            
       }

       return result;
    }
}