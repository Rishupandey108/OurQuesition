class Solution {
    public int countBinarySubstrings(String s) {
        
        int result =0;
        int strike=0,atleast = 1;

        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
             atleast +=1;
            }else{
                strike = atleast;
                atleast = 1;
            }
            if(atleast<=strike){
                result+=1;
            }
            
        }

        return result;
    }
}