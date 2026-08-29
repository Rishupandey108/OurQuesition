class Solution {
    public int mirrorDistance(int n) {

       return Math.abs(n-reverse(n)); 
    }

    public static int reverse(int n){
        
        int result = 0;
        int ten = 10;

        while(n>0){
            int rem = n%10;

            result*=ten;
            result+=rem;

            // ten *=10;
            n/=10;
        }

        return result;

    }
}