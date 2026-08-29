class Solution {
    public int magicalString(int n) {
        
        if(n==0) return 0;

        if(n<=3) return 1;

          int result =1;

        StringBuilder sb = new StringBuilder();

        sb.append("122");
        int index = 2;
        char ch ='1';

        while(sb.length()<n){

                 int val =  sb.charAt(index)-'0';


                 for(int i=0;i<val &&sb.length()<n;i++){

                    sb.append(ch);

                     if(ch=='1'){
                        result+=1;
                     }

                 }

                 if(ch=='1'){
                    ch='2';
                 }else{
                    ch='1';
                 }
                 index +=1;
        }

      

        // for(int i=0;i<sb.length();i++){
        //     if(sb.charAt(i)=='1'){
        //         result++;
        //     }
        // }

        return result;

    }
}