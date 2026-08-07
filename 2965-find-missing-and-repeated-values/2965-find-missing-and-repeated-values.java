class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
         HashMap<Integer,Integer> hsmp = new HashMap<>();

         for(int i=1;i<=grid.length*grid[0].length;i++){
            hsmp.put(i,0);
         }

         for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                hsmp.put(grid[i][j],hsmp.getOrDefault(grid[i][j],0)+1);
            }
         }

         int result[] = new int[grid.length*grid[0].length];
            int j=0;
            
         for(int key:hsmp.keySet()){
            if(hsmp.get(key)==2){
                result[j++] = key;
            }
         }

         for(int key:hsmp.keySet()){
            if(hsmp.get(key)==0){
                result[j++] = key;
                
            }
         }

         return Arrays.copyOf(result,j);
    }
}