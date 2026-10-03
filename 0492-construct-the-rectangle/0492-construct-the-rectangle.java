class Solution {
    public int[] constructRectangle(int area) {
        
       

        int left = (int)Math.sqrt(area);

         while(area%left!=0){
            left--;
         }

         int right = area/left;


         return new int[]{right,left};


    }
}