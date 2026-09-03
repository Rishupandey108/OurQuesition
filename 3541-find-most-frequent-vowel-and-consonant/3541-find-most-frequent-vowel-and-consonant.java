class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character,Integer> hsmp = new HashMap<>();

        for(char ch:s.toCharArray()){
            hsmp.put(ch,hsmp.getOrDefault(ch,0)+1);
        }

        int vowel =0;
        int conson =0;

        for(char ch:hsmp.keySet()){
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vowel = Math.max(vowel,hsmp.get(ch));
            }else{
                conson = Math.max(conson,hsmp.get(ch));
            }
        }

        return vowel+conson;

    }
}