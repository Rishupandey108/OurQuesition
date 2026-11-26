class Solution {
    public boolean canAliceWin(int n) {
        int substract  = 10;

        while(n>=substract)
        {
            n-=substract;
            substract--;
        }

        return substract%2!=0;
    }
}