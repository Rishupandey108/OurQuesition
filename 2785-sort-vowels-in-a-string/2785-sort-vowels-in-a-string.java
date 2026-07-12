class Solution {
    public String sortVowels(String s) {

        String vowel = "AEIOUaeiou";
       String st = "";

       for(int i=0;i<s.length();i++){
        if(vowel(s.charAt(i))){
            st+=s.charAt(i);
        }
       }

       char[] arr = st.toCharArray();


       Arrays.sort(arr);

        StringBuilder sb = new StringBuilder(s);

        int j=0;
       for(int i=0;i<sb.length();i++){
           if(vowel(sb.charAt(i))){
                sb.setCharAt(i,arr[j++]);
            }
       } 

       return sb.toString();
    }

    public static boolean vowel(char ch){
        return ch=='A' || ch=='E' || ch=='I' || ch=='O' ||ch =='U' 
        || ch=='a' || ch=='e' || ch=='i' || ch=='o' ||ch =='u' ;
    }
}