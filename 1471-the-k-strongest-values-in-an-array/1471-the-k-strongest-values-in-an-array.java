class Solution {
    public int[] getStrongest(int[] arr, int k) {
        
        int [] result = new int[k];


        int left =0;
        int right = arr.length-1;
        int count =0;
        Arrays.sort(arr);

        int m = arr[(arr.length-1)/2];

        while(count<k){
            
            if(m-arr[left]>arr[right]-m){
                result[count++] = arr[left++];
            }else{
              result[count++] = arr[right--];
            }
        }

        return result;

       
    }
}