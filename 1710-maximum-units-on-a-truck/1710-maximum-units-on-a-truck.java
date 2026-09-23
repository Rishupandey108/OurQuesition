class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        
        Arrays.sort(boxTypes,(a,b)->Integer.compare(b[1],a[1]));

        int result =0;

        for(int i=0;i<boxTypes.length;i++){
            
            if(truckSize>=boxTypes[i][0]){

                result += boxTypes[i][0]*boxTypes[i][1];

                truckSize-=boxTypes[i][0];
            }else{

                result+= boxTypes[i][1]*truckSize;
                break;
            }
        }

        return result;

    }
}