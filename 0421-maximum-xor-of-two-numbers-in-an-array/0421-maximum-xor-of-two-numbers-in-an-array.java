class Solution {
    public int findMaximumXOR(int[] nums) {

         int Result = 0;

         int mask = 0;

         for(int i=31;i>=0;i--){

            mask |= (1<<i);

            Set<Integer> set = new HashSet<>();

            for(int num:nums){
                int left = num&mask;
                set.add(left);
            }

            int greedy = Result| (1<<i);

            for(int left :set){

                int another = left ^ greedy;

                if(set.contains(another)){
                    Result = greedy;
                    break;
                }
            }
         }

         return Result;
    }
}