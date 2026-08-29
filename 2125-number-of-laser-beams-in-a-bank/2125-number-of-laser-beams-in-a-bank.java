class Solution {
    public int numberOfBeams(String[] bank) {
        int result = 0;

        int prev = 0;

        for(String s :bank){
             int count =0;

             for(char ch:s.toCharArray()){
                if(ch=='1'){
                    count+=1;
                }
             }

             result += (prev*count);
             prev = count>0?count:prev;
        }

        return result;

    }
}