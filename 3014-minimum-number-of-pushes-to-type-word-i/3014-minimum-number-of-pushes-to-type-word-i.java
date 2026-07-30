class Solution {
    public int minimumPushes(String word) {
       int ans =0;
       int len = word.length();
       int row =1;

       int divisor = len/8;
       int reminder = len%8;

       while(divisor >0)
       {
        ans += 8*row;
        divisor--;
        row++;
       } 
       ans +=reminder * row;
       return ans;
    }
}