class Solution {
    public String winningPlayer(int x, int y) {
        
        while(true){

                if(x>=1 && y>=4){

                        x-=1;
                        y-=4;
                }else {
                    return "Bob";
                }

                if(x>=1 && y>=4){
                    x-=1;
                    y-=4;
                }else{
                    return "Alice";
                }
        }
        // return "";
    }
}