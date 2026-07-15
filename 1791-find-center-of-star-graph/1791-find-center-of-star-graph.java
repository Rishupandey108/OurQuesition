class Solution {
    public int findCenter(int[][] edges) {
       int arr[] = new int[1000000];

       for(int a[]:edges){
        arr[a[0]]++;
        arr[a[1]]++;
       }

       int result =0;
       int freq =0;

       for(int i=0;i<arr.length;i++){
        if(arr[i]>freq){
            freq = arr[i];
            result = i;
        }
       }
       return result;
    }
}