class Solution {
    public int[] decompressRLElist(int[] nums) {
        ArrayList<Integer> lst = new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            
            int freq = 2*i;
            int val = 2*i+1;
            if(val>=nums.length || freq>=nums.length){
                break;
            }else{
                     for(int j=0;j<nums[freq];j++){
                            lst.add(nums[val]);
                     }
            }
           
        }

        int result[] = new int[lst.size()];

        for(int i=0;i<lst.size();i++){
                result[i] = lst.get(i);
        }

        return result;
    }
}