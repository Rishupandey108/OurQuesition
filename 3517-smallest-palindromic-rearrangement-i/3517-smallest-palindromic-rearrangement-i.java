class Solution {
    public String smallestPalindrome(String s) {
        int n = s.length();
         char[] arr  = s.substring(0,n/2).toCharArray();

         Arrays.sort(arr);

         String res = new String(arr);

         res += n%2!=0?s.charAt(n/2):"";

         res += new StringBuilder(new String(arr)).reverse();

         return res;
    }
}