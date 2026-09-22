class Solution {
    public List<String> removeAnagrams(String[] words) {
       
       List<String> lst = new ArrayList<>();
       int j=0;
       lst.add(words[0]);

       for(int i=1;i<words.length;i++){

            if(!Anagram(words[i],words[j])){
                lst.add(words[i]);
                j=i;
            }    
       }

        return lst;
      
    }

    private boolean Anagram(String st,String s){
        char[] arr = st.toCharArray();
        char [] ary = s.toCharArray();

        Arrays.sort(arr);
        Arrays.sort(ary);

        return Arrays.equals(arr,ary);
    }
}