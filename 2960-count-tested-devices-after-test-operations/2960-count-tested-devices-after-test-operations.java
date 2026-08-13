class Solution {
    public int countTestedDevices(int[] bP) {
        int result =0;

        for(int i=0;i<bP.length;i++){

            if(bP[i]==0){
                continue;

            }else if(bP[i]>0){

                result+=1;

                for(int j=i+1;j<bP.length;j++){

                    bP[j] = Math.max(0,bP[j]-1);

                }

            }
        }

        return result;
    }
}