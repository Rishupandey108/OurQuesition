class Solution {
    public boolean canMeasureWater(int x, int y, int target) {
        
        if(target>x+y){
            return false;
        }

        return target%GCD(x,y)==0;
    }

    public static int GCD(int x , int y){
        return y==0?x:GCD(y,x%y);
    }

     
}