class Solution {
    public int[] rotateElements(int[] nums, int k) {

        
        
        int j =0;
        int arr[] = new int[nums.length];

        for(int a:nums){
            if(a>=0){
                arr[j++] = a;
            }
        }

        if(j==0) return nums;

         k = k%j;
        reverse(arr,0,k-1);

        reverse(arr,k,j-1);

        reverse(arr,0,j-1);
        j =0;

       

        for(int i=0;i<nums.length;i++){

            if(nums[i]>=0){
                nums[i] = arr[j];
                j+=1;
            }
        }

        return nums;
    }


    public static void reverse(int arr[],int st,int end){

        while(st<=end){

            int temp = arr[st];
            arr[st] = arr[end];
            arr[end] = temp;
            st++;
            end--;
        }
    }
}