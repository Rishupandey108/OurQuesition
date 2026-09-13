class Solution {
    public int largestOverlap(int[][] img1, int[][] img2) {
        List<int[]> img1ones = new ArrayList<>();
         List<int[]> img2ones = new ArrayList<>();

        for(int i=0;i<img1.length;i++){
            for(int j=0;j<img1[0].length;j++){

                if(img1[i][j]==1){
                    img1ones.add(new int[]{i,j});
                }

                if(img2[i][j]==1){
                    img2ones.add(new int[]{i,j});
                }
            }
        }

        int result =0;
        HashMap<String,Integer> hsmp = new HashMap<>();

        for(int img1one[]:img1ones){

            for(int img2one[]:img2ones){

                int dif1 = img2one[0] - img1one[0];
                int dif2 = img2one[1] - img1one[1];

                String compute =  dif2+" "+dif1;

                hsmp.put(compute,hsmp.getOrDefault(compute,0)+1);

                result = Math.max(result,hsmp.get(compute));
            }
        }

        return result;
       
    }
}