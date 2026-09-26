class Solution {
    public int[] minDistinctFreqPair(int[] nums) {
        

        HashMap<Integer,Integer> hsmp = new HashMap<>();

        for(int a:nums){
            hsmp.put(a,hsmp.getOrDefault(a,0)+1);
        }

        int arr[][] = new int[hsmp.size()][2];
        int i=0;

        for(int a:hsmp.keySet()){
            arr[i][0] = a;
            arr[i][1] = hsmp.get(a);
            i++;
        }

        Arrays.sort(arr,(a,b) -> 
           Integer.compare(a[0],b[0])
        );

        int [] res = new int[2];

        for( i=0;i<arr.length;i++){

            for(int j=i+1;j<arr.length;j++){

                if(arr[i][1]!=arr[j][1]){
                    res[0] = arr[i][0];
                    res[1] = arr[j][0];
                    // Arrays.sort(res);
                    return res;
                }
            }

            
        }

        return new int[] {-1,-1};
    }
}