class Solution {
    public int[] findDegrees(int[][] matrix) {
        int[] result = new int[matrix.length];

        for(int i=0;i<matrix.length;i++){
            int Edges = 0;

            for(int a:matrix[i]){
                if(a==1){
                    Edges +=1;
                }
            }

            result[i] = Edges;
        }

        return result;
    }
}