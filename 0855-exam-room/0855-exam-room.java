class ExamRoom {
        TreeSet<Integer> seats;
        int size ;
    public ExamRoom(int n) {
        this.size = n;
        seats = new TreeSet<>();
        
    }
    
    public int seat() {
        
        int seatNumber = 0;

        if(seats.size()>0){
             int distance = seats.first();
            Integer prev = null;
            for(Integer s : seats){

            if(prev!=null){

                    int d = (s-prev)/2;
                    if(distance<d){
                        distance= d;
                        seatNumber = prev + distance;
                    }

            }
            prev = s;

            }

            if(distance <size-1-seats.last()){
                seatNumber = size-1;
            }
        }

        seats.add(seatNumber);
        return seatNumber;
    }
    
    public void leave(int p) {
        seats.remove(p);
    }
}

/**
 * Your ExamRoom object will be instantiated and called as such:
 * ExamRoom obj = new ExamRoom(n);
 * int param_1 = obj.seat();
 * obj.leave(p);
 */