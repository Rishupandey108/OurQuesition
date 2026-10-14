class Solution {
    public String maximumTime(String time) {
        StringBuilder sb = new StringBuilder(time);

        // for(int i=0;i<sb.length();i++){

             

                if(sb.charAt(0)=='?'){
                    if(sb.charAt(1)=='?' || sb.charAt(1)<='3'){
                        sb.setCharAt(0,'2');
                    }else if(sb.charAt(1)>='3'){
                        sb.setCharAt(0,'1');
                    } 
                }
             if(sb.charAt(1)=='?'){

                    if(sb.charAt(0)<'2'){
                        sb.setCharAt(1,'9');
                    }else if(sb.charAt(0)=='2'){
                        sb.setCharAt(1,'3');
                    }
                } 

             sb.setCharAt(3,sb.charAt(3)=='?'?'5':sb.charAt(3));
             sb.setCharAt(4,sb.charAt(4)=='?'?'9':sb.charAt(4));
        
        return sb.toString();
    }
}