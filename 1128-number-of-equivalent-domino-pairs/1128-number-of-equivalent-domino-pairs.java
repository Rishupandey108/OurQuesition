class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        
        HashMap<String,Integer> hsmp = new HashMap<>();
        int result =0;
        for(int ar[]:dominoes){

            int a = Math.min(ar[0],ar[1]);
            int b = Math.max(ar[1],ar[0]);

            String st = a+" "+b;

            int count = hsmp.getOrDefault(st,0);

            result+=count;
            hsmp.put(st,count+1);
        }

         return result;
    }
}