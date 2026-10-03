class Solution {
    public String convertToBase7(int num) {
    
        String st = "";
        boolean negative = false;

        do{
            int rem = num%7;

            if(rem<0){
                negative = true;
                rem *= -1;
            }

            st = rem + st;

            num/=7;
        }while(num!=0);

        if(negative){
            st = "-"+st;
        }

        return st;
    }
}