class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int result =0;

        for(int num:nums){

            result += countdigit(num,digit);
        }

        return result;
    }


    public static int countdigit(int num,int digit){

        int count = 0;

        while(num!=0){

            int rem = num%10;

            num/=10;

             if(rem==digit){
                count+=1;
            }
        }

        return count;
    }
}