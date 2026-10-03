class FrontMiddleBackQueue {
    List<Integer> lst ;

    public FrontMiddleBackQueue() {
        lst =new ArrayList<>();
    }
    
    public void pushFront(int val) {
        lst.add(0,val);
    }
    
    public void pushMiddle(int val) {
        lst.add(lst.size()/2,val);
    }
    
    public void pushBack(int val) {
        lst.add(lst.size(),val);
    }
    
    public int popFront() {
        return lst.isEmpty()?-1:lst.remove(0);
    }
    
    public int popMiddle() {

       if(lst.isEmpty()){
        return -1;
       }

       return lst.remove((lst.size()-1)/2);
    }
    
    public int popBack() {
        return lst.isEmpty()?-1:lst.remove(lst.size()-1);
    }
}

/**
 * Your FrontMiddleBackQueue object will be instantiated and called as such:
 * FrontMiddleBackQueue obj = new FrontMiddleBackQueue();
 * obj.pushFront(val);
 * obj.pushMiddle(val);
 * obj.pushBack(val);
 * int param_4 = obj.popFront();
 * int param_5 = obj.popMiddle();
 * int param_6 = obj.popBack();
 */