class Solution {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        int []result = new int[k];

        HashMap<Integer,HashSet<Integer>> hsmp = new HashMap<>();

        for(int log[]:logs){

            if(!hsmp.containsKey(log[0])){

                hsmp.put(log[0],new HashSet<>());
            }
            hsmp.get(log[0]).add(log[1]);
        }


        for(int key:hsmp.keySet()){

            int hs = hsmp.get(key).size();

            result[hs-1]++;
        }

        return result;
    }
}