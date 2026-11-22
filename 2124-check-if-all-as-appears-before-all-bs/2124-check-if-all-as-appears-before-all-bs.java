class Solution {
    public boolean checkString(String s) {
        boolean result =false;
       for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='b'){
             return (!s.substring(i+1,s.length()).contains("a"));
        }
       } 
       return true ;
    }
}
