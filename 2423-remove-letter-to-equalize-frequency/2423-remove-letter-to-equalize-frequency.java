class Solution {
    public boolean equalFrequency(String word) {
         
        int[] arr = new int[26];

        for(char ch:word.toCharArray()){
            arr[ch-'a']++;
        }

         for(char ch:word.toCharArray()){

            arr[ch-'a']--;

            if(FrequencyValid(arr)){
                return true;
            }

            arr[ch-'a']++;
         }

         return false;
         
    }

    public boolean FrequencyValid(int[]arr){

        int first =0;

        for(int a:arr){
            if(a==0){
                continue;
            }


            if(first==0){
                first = a;
            }else if(first!=a){
                return false;
            }
        }

        return true;
    }
}