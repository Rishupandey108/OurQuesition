class Solution {
    public boolean checkDivisibility(int n) {
        int temp = n;
        int sum = 0;
        int product = 1;

        while(temp!=0){
            int t = temp%10;

            sum+=t;
            product *= t;

            temp/=10;
        }


        return n%(sum+product)==0;

    }
}
    