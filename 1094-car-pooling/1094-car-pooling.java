class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        
        Arrays.sort(trips,(a,b)->{
           return  Integer.compare(a[1],b[1]);
        });

        HashSet<Integer> hst = new HashSet<>();


        int totalcontain =0;

        for(int i=0;i<trips.length;i++){

            totalcontain+=trips[i][0];

            for(int j=0;j<i;j++){
                if(hst.contains(j)){

                    continue;

                }else if(trips[j][2]<=trips[i][1]){
                    totalcontain-=trips[j][0];
                    hst.add(j);
                }
            }

            if(totalcontain>capacity){
                return false;
            }
        }
        return true;
    }
}