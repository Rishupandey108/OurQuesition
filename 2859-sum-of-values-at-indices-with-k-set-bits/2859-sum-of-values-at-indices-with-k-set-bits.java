class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        
        int sum =0;

        for(int i=0;i<nums.size();i++){

                String st = Integer.toBinaryString(i);
                
                int ones =0;

                for(int j=0;j<st.length();j++){
                    if(st.charAt(j)=='1'){
                        ones++;
                    }
                }

                if(ones==k){
                    sum+=nums.get(i);
                }
        }

        return sum;

    }
}