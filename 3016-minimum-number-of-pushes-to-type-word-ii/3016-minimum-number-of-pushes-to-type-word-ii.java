class Solution {
    public int minimumPushes(String word) {
        int [] arr = new int[26];
        
         

        for(char ch:word.toCharArray()){
            arr[ch-'a']++;

        }

        int result =0;

         Arrays.sort(arr);

         for(int i=25,pushcount =0;i>=0;i--){

            int curr = 25-i;

            if(curr%8==0) pushcount+=1;

            result+= arr[i]*pushcount;
         }

        return result;
    }
}