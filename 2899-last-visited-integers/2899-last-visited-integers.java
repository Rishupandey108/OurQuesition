class Solution {
    public List<Integer> lastVisitedIntegers(int[] nums) {
       List<Integer> result = new ArrayList<>();

       List<Integer> seen = new ArrayList<>();

        int k = 0;

        for(int num:nums){
            if(num>0){

                seen.add(0,num);
                k=0;

            }else{

                    k++;
                if(k>seen.size()){

                    result.add(-1);

                }else {

                   
                    result.add(seen.get(k-1));

                   
                }
                
              
            }
        }

        return result;
    }
}