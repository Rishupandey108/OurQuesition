class Solution {
    public int kthSmallest(int[][] matrix, int k) {

        ArrayList<Integer> lst = new ArrayList<>();

        for(int ar[]:matrix){

            for(int a:ar){
                lst.add(a);
            }
        }

        Collections.sort(lst);

        return lst.get(k-1);

    }
}