class Solution {
    public String sortVowels(String s) {

        String vowel = "AEIOUaeiou";
       String st = "";

       for(int i=0;i<s.length();i++){
        if(vowel.indexOf(s.charAt(i))!=-1){
            st+=s.charAt(i);
        }
       }

       char[] arr = st.toCharArray();


       Arrays.sort(arr);

        StringBuilder sb = new StringBuilder(s);

        int j=0;
       for(int i=0;i<sb.length();i++){
           if(vowel.indexOf(sb.charAt(i))!=-1){
                sb.setCharAt(i,arr[j++]);
            }
       } 

       return sb.toString();
    }
}