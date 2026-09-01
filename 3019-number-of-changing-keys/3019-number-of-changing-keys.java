class Solution {
    public int countKeyChanges(String s) {
        
        int result = 0;

        for(int i=1;i<s.length();i++){

            if(Character.toLowerCase(s.charAt(i))==s.charAt(i-1) || Character.toUpperCase(s.charAt(i))==s.charAt(i-1)){
                    continue;
            }else{
                result+=1;
            }

            
        }

        return result;
    }
}