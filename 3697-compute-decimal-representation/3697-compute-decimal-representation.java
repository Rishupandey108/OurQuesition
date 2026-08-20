class Solution {
    public int[] decimalRepresentation(int n) {
       int len = String.valueOf(n).length();
        int []result = new int[len];

        int j = len;
       int div = 10;
       

       while(n!=0){
        
        int temp = n%div;

        if(temp!=0){
        result[--j] = temp;
        n-=temp;
        }
        div*=10;
       } 

       return Arrays.copyOfRange(result,j,len);
    }
}