class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        

        int val1 =m;
        int val2 =n;

        for(int ar[]:ops){

                 if(ar[0]<val1) val1 = ar[0];
                 if(ar[1]<val2) val2 = ar[1];
        }

        return val1*val2;
    }
}