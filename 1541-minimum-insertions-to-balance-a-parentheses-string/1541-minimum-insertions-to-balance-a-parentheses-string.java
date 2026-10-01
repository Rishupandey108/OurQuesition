class Solution {
    public int minInsertions(String s) {
         int open =0;
         int result =0;
           
        s = s.replace("))","]");

        for(char ch:s.toCharArray()){
                if(ch=='('){

                    open+=1;

                } else if((ch==']' || ch==')') && open>0){

                    open-=1;
                    result+= ch==')'?1:0;

                }else {

                    result+= ch==')'?2:1;
                    
                }
        }

        return result+ open *2;
    }
}