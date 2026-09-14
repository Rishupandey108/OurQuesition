class Solution {
    public String lastNonEmptyString(String s) {
         int arr[] = new int[26];

         for(char c:s.toCharArray()){
            arr[c-'a']++;
         }


         int max = 0;

         for(int i=0;i<26;i++){
            max = Math.max(max,arr[i]);
         }


         StringBuilder sb = new StringBuilder();

         for(int i=0;i<s.length();i++){

            if(arr[s.charAt(i)-'a']==max && s.indexOf(s.charAt(i),i+1)==-1){
                    sb.append(s.charAt(i));
            }
         }

         return sb.toString();
    }
}