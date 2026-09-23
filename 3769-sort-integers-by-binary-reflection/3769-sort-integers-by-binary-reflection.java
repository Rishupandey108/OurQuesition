class Solution {
    public int[] sortByReflection(int[] nums) {
        
           Integer[] arr = new Integer[nums.length];

           for(int i=0;i<nums.length;i++){
                arr[i] = nums[i];
           }

           Arrays.sort(arr,(a,b)->{

                int a1 = Integer.parseInt(new StringBuilder(Integer.toBinaryString(a)).reverse().toString(),2);

                int b1 = Integer.parseInt(new StringBuilder(Integer.toBinaryString(b)).reverse().toString(),2);

                if(a1!=b1){
                   return  Integer.compare(a1,b1);
                }
               return  Integer.compare(a,b);
           });

           for(int i=0;i<nums.length;i++){
               nums[i]= arr[i];
           }

           return nums;
    }
}