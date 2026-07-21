class Solution {
    public long gcdSum(int[] nums) {

       long max = nums[0] ;
       long arr[] = new long[nums.length];

       for(int i=0;i<nums.length;i++){

            max = Math.max(max,nums[i]);
            arr[i] =(long) gcd(max,nums[i]);
       }

        Arrays.sort(arr);

        int left=0;
        int right = nums.length-1;

        max =0;
        while(left<right){
            max+=gcd(arr[left],arr[right]);
            left++;
            right--;
        }


        return max;
    }


    public static long  gcd(long a,long b){
            return b==0?a:gcd(b,a%b);
    }
}