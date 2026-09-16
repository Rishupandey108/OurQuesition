class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> hst = new HashSet<>();

        for(String st:emails){
            StringBuilder sb = new StringBuilder(st);
            int at = sb.indexOf("@");

             for(int i=0;i<at;){
                if(sb.charAt(i)=='+'){
                    sb.delete(i,at);
                    break;
                }
                if(sb.charAt(i)=='.'){
                    sb.deleteCharAt(i);
                    at--;
                }else{
                    i++;
                }

             }
            hst.add(sb.toString());
        }

        return hst.size();
    }
}