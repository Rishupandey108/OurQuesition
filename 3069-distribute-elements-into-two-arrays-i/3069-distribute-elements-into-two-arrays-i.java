class Solution {
    public int[] resultArray(int[] nums) {
       int [] arr = new int[60];

        arr[0] = nums[1];
       int j=0;
       int k = 0;

       

       for(int i=2;i<nums.length;i++){

           if(nums[k]>arr[j]){
                     
                    nums[++k] = nums[i];

            }else if(nums[k]<arr[j]){
                     
                     arr[++j] = nums[i];
                }
            }
        

       for(int i =0;i<=j;i++){
             
             nums[++k] = arr[i];
       }

       return nums;
    }
}