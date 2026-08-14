class Solution {
    public int maximumLengthSubstring(String s) {
       int maxlen =0;

       for(int i=0;i<s.length();i++){
        char[] arr = new char[26];
        int count =0;

        for(int j=i;j<s.length();j++){
            arr[s.charAt(j)-'a']++;
            if(arr[s.charAt(j)-'a']>2)
             {
                break;
             }
            count++;
        }

        maxlen=Math.max(maxlen,count);
       }
        return maxlen;
    }
}