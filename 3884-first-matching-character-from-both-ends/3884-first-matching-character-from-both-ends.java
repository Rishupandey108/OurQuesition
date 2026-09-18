class Solution {
    public int firstMatchingIndex(String s) {
        int index =Integer.MAX_VALUE;
        int n = s.length();


         int left =0;
         int right = s.length()-1;

         while(left<=right){
            if(s.charAt(left)==s.charAt(right)){
                index = Math.min(index,left);
            }
            left++;
            right--;
         }

        return index==Integer.MAX_VALUE?-1:index;
    }
}