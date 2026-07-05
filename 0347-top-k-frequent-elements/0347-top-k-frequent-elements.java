class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        int[] result = new int[k];

        HashMap<Integer,Integer> hsmp = new HashMap<>();


        for(int i:nums){
            hsmp.put(i,hsmp.getOrDefault(i,0)+1);
        }


        int[][] arr = new int[hsmp.size()][2];
        int i=0;

        for(int a : hsmp.keySet()){
            arr[i][0] = a;
            arr[i][1] = hsmp.get(a);
            i++;
        }


        Arrays.sort(arr,(a,b) -> Integer.compare(b[1],a[1]));


        i=0;
        for(int j=0;j<k;j++){
            result[i++] = arr[j][0];
        }

        return result;
    }
}