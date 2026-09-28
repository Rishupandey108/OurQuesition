class Solution {
    public String decodeMessage(String key, String message) {
        
        HashMap<Character,Character> hsmp = new HashMap<>();

        char ch='a';

        for(char chr:key.toCharArray()){
            if(chr==' '){
                continue;
            }else if(!hsmp.containsKey(chr)){
                hsmp.put(chr,ch);
                ch++;
            }
        }

        StringBuilder sb = new StringBuilder(message);

        for(int i=0;i<sb.length();i++){

            if(sb.charAt(i)==' '){
                continue;
            }else{

                sb.setCharAt(i,hsmp.get(sb.charAt(i)));
            }
        }

        return sb.toString();
    }
}