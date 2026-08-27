class Solution {
    public int incremovableSubarrayCount(int[] nums) {
       int result =0;
       int n = nums.length;
        

        for(int i=0;i<n;i++){

                for(int j=i;j<n;j++){

                    int prev = -1;
                    boolean flag = true;

                    for(int k=0;k<n;k++){
                        if(k>=i && k<=j){
                            continue;
                        }else {

                            flag &= (prev<nums[k]);
                            prev = nums[k];
                        }
                    }


                    result += flag?1:0;
                }
        }

        return result;


    }
}