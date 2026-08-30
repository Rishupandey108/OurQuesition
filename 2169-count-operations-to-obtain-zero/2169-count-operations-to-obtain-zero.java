class Solution {
    public int countOperations(int num1, int num2) {

        if(num1==0 || num2==0) return 0;
        
        if(num1==num2) return 1;
        int result =0;

        while(num1>0 || num2>0){

            if(num1>num2){
                num1 = num1 - num2;
            }else if(num1==num2){
                result+=1;
                break;
            }else{
                num2 = num2 - num1;
            }

            result+=1;
        }

        return result;
    }
}