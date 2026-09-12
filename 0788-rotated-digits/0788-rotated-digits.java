class Solution {
    public int rotatedDigits(int n) {
         
        int result = 0;

        for(int i=1;i<=n;i++){

            boolean valid = false;
            boolean invalid = true;
            int val = i;
            while(val>0){

                int rem = val%10;

                if(rem == 3 || rem ==4 ||  rem==7){
                    invalid = false;
                    break;
                }

                if(rem==2 || rem==5 || rem==6 || rem==9){
                    valid = true;
                }


                 val/=10;
            }

            if(invalid && valid){
                result+=1;
            }
           
            
        }
        return result;
    }
}