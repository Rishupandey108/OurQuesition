class Solution {
    public String maximumTime(String time) {
        StringBuilder sb = new StringBuilder(time);

        for(int i=0;i<sb.length();i++){

            if(sb.charAt(i)=='?'){

                if(i==0){
                    if(sb.charAt(i+1)=='?' || sb.charAt(i+1)<='3'){
                        sb.setCharAt(i,'2');
                    }else if(sb.charAt(i+1)>='3'){
                        sb.setCharAt(i,'1');
                    }else {
                        sb.setCharAt(i,'0');
                    }
                }else if(i==1){

                    if(sb.charAt(i-1)<'2'){
                        sb.setCharAt(i,'9');
                    }else if(sb.charAt(i-1)=='2'){
                        sb.setCharAt(i,'3');
                    }
                }else if(i==3){
                     sb.setCharAt(i,'5');
                }else if(i==4){
                    sb.setCharAt(i,'9');
                }
            }
        }
        return sb.toString();
    }
}