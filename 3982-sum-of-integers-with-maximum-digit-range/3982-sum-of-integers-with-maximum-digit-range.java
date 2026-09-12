class Solution {
    public int maxDigitRange(int[] nums) {
        
        int[][] arr = new int[nums.length][2];

        for(int i = 0;i<nums.length;i++){

            int val = nums[i];
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;

            while(val>0){
                int temp = val%10;
                min = Math.min(temp,min);
                max = Math.max(max,temp);
                val/=10;
            }

            arr[i][0] = nums[i];
            arr[i][1] = max - min;
        }

        Arrays.sort(arr,(a,b)-> Integer.compare(b[1],a[1]));

        int result = arr[0][0];
        int max = arr[0][1];

        for(int i=1;i<nums.length;i++){
            if(arr[i][1]==max){
                result+=arr[i][0];
            }else{
                break;
            }
        }

        return result;
    }
}