class Solution {
    public int maxEvents(int[][] events) {
        
        int n = events.length;

        Arrays.sort(events,(a,b)->{
            if(a[0]!=b[0]){
                return Integer.compare(a[0],b[0]);
            }else{
                return Integer.compare(a[1],b[1]);
            }
        });
        PriorityQueue<Integer> pq  = new PriorityQueue<>();

        int i=0;
        int day = events[0][0];
        int result =0;

        while(!pq.isEmpty() || i<n){

            while(i<n &&  day==events[i][0]){
                pq.add(events[i][1]);
                i++;
            }

            if(!pq.isEmpty()){
                pq.remove();
                result+=1;
            }

            day++;

            while(!pq.isEmpty() && pq.peek()<day){
                pq.remove();
            }
        }

        return result;

    }
}