class Solution {
    public String[] createGrid(int m, int n) {
      
      String[][] Grid = new String[m][n];

       for(String arr[] :Grid){
            Arrays.fill(arr,"#");
       }
       

        for(int i=0;i<n;i++){
            Grid[0][i]=".";
        }

        for(int i=0;i<m;i++){
            Grid[i][n-1]=".";
        }

       String[] result = new String[m];



       for(int i=0;i<Grid.length;i++){
            
             StringBuilder sb = new StringBuilder();

             for(String st:Grid[i]){
                sb.append(st);
             }
             result[i]=sb.toString();
       }


       return result;
 
    }

     
}