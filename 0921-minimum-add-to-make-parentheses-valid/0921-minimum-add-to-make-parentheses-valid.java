class Solution {
    public int minAddToMakeValid(String s) {
        StringBuilder sb = new StringBuilder();

       for(char ch:s.toCharArray()){

        if(ch=='('){
            sb.append(ch);
        }else if(sb.length()!=0 && ch==')' && sb.charAt(sb.length()-1)=='('){
            sb.deleteCharAt(sb.length()-1);
        }else {
            sb.append(ch);
        }
       }

       return sb.length();
    }
}