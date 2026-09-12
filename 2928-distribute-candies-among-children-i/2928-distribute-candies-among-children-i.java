class Solution {
    public int distributeCandies(int n, int limit) {
        int count =0;

        for(int i=0;i<=limit;i++){
            for(int j=0;j<=limit;j++){
                int z = n-i-j;
                if(z>=0&&z<=limit){
                    count+=1;
                }
            }
        }

        return count;
    }
}