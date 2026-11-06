class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int result[] = new int[(n-k)+1];

        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) ->{
            return Integer.compare(nums[b],nums[a]);
        });

        int i=0,j=0;

        while(j<k){
            pq.offer(j);
            j++;
        }

        result[0] = nums[pq.peek()];

        int u =1;

        while(j<n){

            i++;
            pq.offer(j);

            while(!pq.isEmpty()  && pq.peek()<i){
                pq.poll();
            }

            result[u++] = nums[pq.peek()];
            j++;

        }
        
        return result;
    }
}