class Solution {
    public int distributeCandies(int[] candyType) {
        
       HashSet<Integer> hst = new HashSet<>();
       int result =0;

      for(int a:candyType){
        hst.add(a);
      }

      result = Math.min(hst.size(),candyType.length/2);

       return result;
    }
}