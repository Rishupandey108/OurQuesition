class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        
        HashMap<String,String> hsmp = new HashMap<>();

        for(List<String> ls : knowledge){

                hsmp.put(ls.get(0),ls.get(1));
        }

        StringBuilder sb = new StringBuilder();

        for(int i=0;i<s.length();i++){
            
            if(s.charAt(i)=='('){
                int temp = i;

                while(i<s.length() && s.charAt(i)!=')'){
                    i++;
                }
                String st = s.substring(temp+1,i);

                if(hsmp.containsKey(st)){
                    sb.append(hsmp.get(st));
                }else{
                    sb.append("?");
                }
            }else{
                sb.append(s.charAt(i));
            }
        }

        return sb.toString();
    }
}