class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        
        int result = 0;

        for(int i=0;i<worker.length;i++){

            int small =-1;
            for(int j=difficulty.length-1;j>=0;j--){
                if(small ==-1){
                    if(difficulty[j]<=worker[i]){
                        small=j;
                    }
                }else{
                        if(difficulty[j]<=worker[i] && profit[j]>profit[small]){
                            small = j;
                        }
                }
                
            }

            result += small==-1?0:profit[small];
        }

        return result;
    }
}