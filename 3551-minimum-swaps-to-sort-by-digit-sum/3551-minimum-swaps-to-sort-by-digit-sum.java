class Solution {
    public int minSwaps(int[] nums) {
        
        int n = nums.length;

        int[][] arr = new int[n][3];

        for(int i=0;i<n;i++){
            int temp = nums[i];

            while(temp>0){
                arr[i][0]+= temp%10;
                temp/=10;
            }

            arr[i][1] = nums[i];
            arr[i][2] = i;
        }


        Arrays.sort(arr,(a,b)->{
             if(a[0]!=b[0]){
                return Integer.compare(a[0],b[0]);
             }
             if(a[1]!=b[1]){
                return Integer.compare(a[1],b[1]);
             }
             return Integer.compare(a[2],b[2]);
        });

        int[]Totalround = new int[n];

        for(int i=0;i<n;i++){
            Totalround[i] = arr[i][2];
        }

        boolean visited[] = new boolean[n];

        int cycledetected =0;

        for(int i=0;i<n;i++){

            if(visited[i]){
                continue;
            }

            cycledetected+=1;

            int j =i;

            while(!visited[j]){
                visited[j] = true;
                j = Totalround[j];
            }

            
        }

        return n - cycledetected;

    }
}