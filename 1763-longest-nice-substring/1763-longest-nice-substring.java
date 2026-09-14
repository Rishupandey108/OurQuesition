class Solution {
    public String longestNiceSubstring(String s) {
         
        String result ="";
         for(int i=0;i<s.length();i++){

            HashSet<Character> hst = new HashSet<>();
            
            
            
            for(int j=i+1;j<s.length();j++){

                    if(isNiceSubstring(hst,s,i,j)){

                        String temp = s.substring(i,j+1);
                        if(temp.length()>result.length()){
                            result = temp;
                        }

                    } 
            }
         }

         return result;

    }

    public boolean isNiceSubstring(HashSet<Character> hst ,String s,int n,int m){

            for(int i=n;i<=m;i++){
                hst.add(s.charAt(i));
            }


            for(int i=n;i<=m;i++){
                
                if(Character.isUpperCase(s.charAt(i)) && hst.contains(Character.toLowerCase(s.charAt(i)))){
                    continue;
                }else if(Character.isLowerCase(s.charAt(i)) && hst.contains(Character.toUpperCase(s.charAt(i)))){
                    continue;
                }else{
                    return false;
                }
            }

            return true;
    }
} 