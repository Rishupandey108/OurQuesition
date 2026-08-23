class Solution {
    public boolean sumGame(String num) {
       
       int leftcount = 0;
       int rightcount =0;

       int Leftsum = 0;
       int Rightsum =0;


       for(int i=0;i<num.length()/2;i++){


        char c1 = num.charAt(i);

        if(c1=='?'){
            leftcount++;
        }else{
            Leftsum+=c1-'0';
        }


        char c2 = num.charAt(num.length()/2+i);

        if(c2=='?'){
            rightcount++;
        }else{
            Rightsum += c2-'0';
        }
       }

        return (Leftsum - Rightsum)*2 != (rightcount - leftcount)*9;
    }
}