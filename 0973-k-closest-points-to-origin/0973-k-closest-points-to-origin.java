class Solution {
    public int[][] kClosest(int[][] points, int k) {

        if(points.length==k) return points;
        
        HashMap<int[],Double> hsmp = new HashMap<>();

       
       for(int ar[]:points){

            double temp = Math.sqrt((ar[0]*ar[0])+(ar[1]*ar[1]));
            hsmp.put(ar,temp);
       }


       List<int[]> lst = new ArrayList<>(hsmp.keySet());

       lst.sort((a,b)->{
            
            return Double.compare(hsmp.get(a),hsmp.get(b));

       });


       int[][] result = new int[k][2];

    //    int j=0;

       for(int i=0;i<k;i++){
            result[i] = lst.get(i);
       }

       return result;

    }
}