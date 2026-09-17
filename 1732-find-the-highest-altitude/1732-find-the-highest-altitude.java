class Solution {
    public int largestAltitude(int[] gain) {
        int result = gain[0]<0?0:gain[0];

        int prefix = gain[0] ;

        for(int i=1;i<gain.length;i++){
            prefix +=gain[i];
            result = Math.max(result,prefix);
        }

        return result;
    }
}