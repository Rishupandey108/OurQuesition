class Solution {
    public double calculateTax(int[][] brackets, int income) {
        double result = 0;

        Arrays.sort(brackets,(a,b) -> Integer.compare(a[0],b[0]));

        int prev =0;
        for(int a[]:brackets){
                 
            if(income  >= (a[0]-prev)){

                result += (double)  (a[0]-prev) * a[1] / 100;
                income -= (a[0]-prev);
                prev = a[0];

            }else {
                
                result+= (double) income   * a[1]/100;
                return result;
            }
        }


        return result;

    }
}