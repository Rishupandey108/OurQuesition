// import java.math.BigInteger;
class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        
       List<String> lst = new ArrayList<>();

       for(String s:nums){
        lst.add(s);
       }


       lst.sort((a,b)->{
            if(a.length()==b.length()){
                return a.compareTo(b);
            }
            return Integer.compare(a.length(),b.length());
       });

       return lst.get(nums.length-k);
    }
}