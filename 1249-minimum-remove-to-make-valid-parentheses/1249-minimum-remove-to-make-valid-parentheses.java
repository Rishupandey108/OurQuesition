class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder sb = new StringBuilder(s);
        int count =0;

        for(int i=0;i<s.length();i++){
            if(sb.charAt(i)=='('){
                    count+=1;
            }else if(sb.charAt(i)==')'){
                    if(count>0){
                        count-=1;
                    }else{
                        sb.setCharAt(i,'#');
                    }
            }
        }

        count =0;
        for(int i=sb.length()-1;i>=0;i--){

                if(sb.charAt(i)==')'){
                    count+=1;
                }else if(sb.charAt(i)=='('){
                    if(count>0){
                        count-=1;
                    }else{
                        sb.setCharAt(i,'#');
                    }
                }
        }

        while(sb.indexOf("#")>=0){
            int index = sb.indexOf("#");
            sb.deleteCharAt(index); 
        }

        return sb.toString();
        
    }
}