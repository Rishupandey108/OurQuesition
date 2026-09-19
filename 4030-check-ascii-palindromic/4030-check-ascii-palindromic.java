class Solution {
    public boolean isPalindromic(String s) {
         String st ="";

         for(char ch:s.toCharArray()){

            String str = Integer.toBinaryString((int)(ch));

            while(str.length()<8){
                str="0"+str;
            }

            st+=str;
         }


         int left =0;
         int right = st.length()-1;

         while(left<=right){
            if(st.charAt(left)!=st.charAt(right)){
                return false;
            }
            left++;
            right--;
         }

         return true;
    }
}