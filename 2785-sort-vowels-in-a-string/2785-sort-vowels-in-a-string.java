class Solution {
    public String sortVowels(String s) {

        String vowel = "AEIOUaeiou";
        ArrayList<Character> lst = new ArrayList<>();

       for(int i=0;i<s.length();i++){
        if(vowel(s.charAt(i))){
             lst.add(s.charAt(i));
        }
       }

        Collections.sort(lst);

        StringBuilder sb = new StringBuilder(s);

        int j=0;
       for(int i=0;i<sb.length();i++){
           if(vowel(sb.charAt(i))){
                sb.setCharAt(i,lst.get(j++));
            }
       } 

       return sb.toString();
    }

    public static boolean vowel(char ch){
        return ch=='A' || ch=='E' || ch=='I' || ch=='O' ||ch =='U' 
        || ch=='a' || ch=='e' || ch=='i' || ch=='o' ||ch =='u' ;
    }
}