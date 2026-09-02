class MedianFinder {

     private PriorityQueue<Integer> sq = new PriorityQueue<>(Collections.reverseOrder());
     private PriorityQueue<Integer> lq = new PriorityQueue<>();
     private boolean even = true;

    public MedianFinder() {
        
    }
    
    public void addNum(int num) {
        if(even){
            lq.offer(num);
            sq.offer(lq.poll());
        }else{
            sq.offer(num);
            lq.offer(sq.poll());
        }

        even = !even;
    }
    
    public double findMedian() {
        if(even){
            return (double)(sq.peek()+lq.peek())/2;
        }else{
            return sq.peek();
        }
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */