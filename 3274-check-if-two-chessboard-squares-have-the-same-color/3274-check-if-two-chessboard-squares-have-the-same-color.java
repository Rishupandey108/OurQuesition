class Solution {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        
        return FindColor(coordinate1)==FindColor(coordinate2);
    }


    private  boolean FindColor(String s){

        return (s.charAt(0)-'a')%2==(s.charAt(1)-'0')%2;
        
    }
}