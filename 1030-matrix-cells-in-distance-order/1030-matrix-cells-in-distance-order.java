class Solution {
    public int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
        
        
         
        ArrayList<int[]> lst = new ArrayList<>();

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                lst.add(new int[]{i,j});
            }
        }


        Collections.sort(lst,(a,b)->{
            int diff1 = Math.abs(rCenter-a[0])+Math.abs(cCenter-a[1]);
            int diff2 = Math.abs(rCenter-b[0])+Math.abs(cCenter-b[1]);

            return Integer.compare(diff1,diff2);
        });

        int[][] result = new int[rows*cols][2];

        

        for(int i=0;i<rows*cols;i++){
            result[i] = lst.get(i);
             
        }

        return result;

    }
}