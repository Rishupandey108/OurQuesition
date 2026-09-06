class Solution {
    public boolean checkStraightLine(int[][] c) {

        int x0 = c[0][0] , y0 = c[0][1];
        int x1 = c[1][0],y1 = c[1][1];

        int dif1 = x1-x0,dif2 = y1-y0;

        for(int[]arr:c){

            int x = arr[0],y=arr[1];

            if(dif1*(y-y1)!=dif2*(x-x1))
                return false;
        }

        return true;
        
    }
}