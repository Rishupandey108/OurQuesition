class Solution {
    public boolean buddyStrings(String s, String goal) {
      

        if(s.length()!=goal.length()){
            return false;
        }

        if(s.equals(goal)){
            int[] freq= new int[26];

            for(char ch:s.toCharArray()){
                freq[ch-'a']++;
                if(freq[ch-'a']==2){
                    return true;
                }
            }
            return false;
        }

        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=0;i<s.length();i++){

            if(s.charAt(i)!=goal.charAt(i)){
                ans.add(i);
                if(ans.size()>2){
                    return false;
                }
            }
        }

        return ans.size()==2 && s.charAt(ans.get(0))==goal.charAt(ans.get(1)) 
        && s.charAt(ans.get(1))==goal.charAt(ans.get(0));

    }
}