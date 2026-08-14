class Solution {
    public int maxHeightOfTriangle(int red, int blue) {

       return Math.max(MaxHeight(red,blue),MaxHeight(blue,red));
    }

    private int MaxHeight(int red,int blue){

        int height =0;
        int i=1;

        while(true){

            if(i%2==1){
                if(red>=i){
                    red-=i;
                }else{
                    break;
                }
            }else{
                if(blue>=i){
                    blue-=i;
                }else {
                    break;
                }
            }

            height++;
            i++;
        }

        return height;
    }
}