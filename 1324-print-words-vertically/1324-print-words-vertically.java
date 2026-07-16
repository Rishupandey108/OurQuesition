 class Solution {
    public List<String> printVertically(String s) {
        List<String> lst = new ArrayList<>();
        String[] arr = s.split(" ");
        int strlen = 0;

        for(String str:arr){
            strlen = Math.max(strlen,str.length());
        }

        for(int i=0;i<strlen;i++){
            String str = "";

            for(String st:arr){
                if(i<st.length()){
                    str+=st.charAt(i);
                }else if(i>=st.length()){
                    str+=" ";
                }
            }
            int remspace = str.length()-1;
            while(remspace>=0 && str.charAt(remspace)==' '){
                remspace--;
            }

            lst.add(str.substring(0,remspace+1));
        }
        return lst;
         
    }
}