class Solution {
    public int longestOnes(int[] nums, int k) {
        
           int result =0;

           for(int i=0;i<nums.length;i++){

                 
                    int temp =0;
                    int count =0;
                    int j=i;

                    while(j<nums.length){
                        
                        if(nums[j]==1){

                            count+=1;

                        }else{

                            if(temp==k){
                                break;
                            }
                            count+=1;
                            temp+=1;
                        }
                        j++;
                    }

                    result = Math.max(result,count);
                }
           

           return result; 

    }
}