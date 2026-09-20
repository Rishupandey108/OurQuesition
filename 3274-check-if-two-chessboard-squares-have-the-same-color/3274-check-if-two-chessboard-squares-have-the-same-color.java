class Solution {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        
        return FindColor(coordinate1).equals(FindColor(coordinate2));
    }


    private  String FindColor(String s){

        int alpha = s.charAt(0)-'a';
        int digit = s.charAt(1)-'0';

        if(alpha%2==1 && digit%2==1){
            return "White";
        }
        if(alpha%2==0 && digit%2==0){
            return "White";
        }

        return "Black";

    }
}