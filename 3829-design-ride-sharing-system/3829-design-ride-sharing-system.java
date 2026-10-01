class RideSharingSystem {
        Queue<Integer> Dq; 
        Queue<Integer> Rq; 

    public RideSharingSystem() {
        Dq = new LinkedList<>();
        Rq = new LinkedList<>();
    }
    
    public void addRider(int riderId) {
        Rq.add(riderId);
    }
    
    public void addDriver(int driverId) {
        Dq.add(driverId);
    }
    
    public int[] matchDriverWithRider() {
        if(Dq.isEmpty() || Rq.isEmpty()){
             return new int[]{-1,-1};
        }

        return new int[]{Dq.remove() , Rq.remove()};
    }
    
    public void cancelRider(int riderId) {
        
        Rq.remove(riderId);
    }
}

/**
 * Your RideSharingSystem object will be instantiated and called as such:
 * RideSharingSystem obj = new RideSharingSystem();
 * obj.addRider(riderId);
 * obj.addDriver(driverId);
 * int[] param_3 = obj.matchDriverWithRider();
 * obj.cancelRider(riderId);
 */