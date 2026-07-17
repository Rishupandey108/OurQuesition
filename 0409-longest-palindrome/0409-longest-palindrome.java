class Solution {
    public int longestPalindrome(String s) {
       int[] arr  = new int[128];

       for(char ch:s.toCharArray()){
        arr[ch]++;
       } 


        int length=0;
        boolean hasodd = false;


        for(int count :arr){
            if(count%2==0){

                length+= count;
      
            }else{ 

                length+= count-1;

                hasodd = true;

            }
        }

       return hasodd?length+1:length;
    }
}