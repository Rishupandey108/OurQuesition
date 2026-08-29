class Solution {
    public int digitFrequencyScore(int n) {

      HashMap<Integer,Integer> hsmp = new HashMap<>();

      while(n!=0){

        int rem = n%10;

        n/=10;

        hsmp.put(rem,hsmp.getOrDefault(rem,0)+1);
      }

      int result = 0;

      for(int a:hsmp.keySet()){

            result += a*hsmp.get(a);
      }


      return result;  
    }
}