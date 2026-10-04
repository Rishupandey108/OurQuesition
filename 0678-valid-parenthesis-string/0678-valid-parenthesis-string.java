class Solution {
    public boolean checkValidString(String s) {
         int minval =0 , maxval=0;
         for(char c:s.toCharArray()){
            if(c=='(')
         {
            minval++;
            maxval++;
         } else if(c==')'){
            minval--;
            maxval--;
         }else{
            minval--;
            maxval++;
         }
         if(maxval<0) return false;
         minval = Math.max(minval,0);
         }
       return minval==0;  
    }
}