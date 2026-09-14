class Solution {
    public int rearrangeCharacters(String s, String target) {
        int string1[] = new int[26];
        int string2[] = new int[26];

        for(char ch:s.toCharArray()){
            string1[ch-'a']++;
        }

        for(char ch:target.toCharArray()){
            string2[ch-'a']++;
        }

        int result =Integer.MAX_VALUE;

        for(char ch:target.toCharArray()){

                result = Math.min(result,string1[ch-'a']/string2[ch-'a']);
        }

        return result;
        
    }
}