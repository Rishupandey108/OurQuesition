class MyCalendar {

        class Node{
            int st;
            int end;
            Node(int s,int e){
                this.st =s;
                this.end = e;
            }
        }
    List<Node> lst;

    public MyCalendar() {
        lst = new ArrayList<>();
    }
    
    public boolean book(int startTime, int endTime) {
        
        for(Node n :lst){
            if(n.end>startTime && n.st<endTime){
                return false;
            }
        }

        lst.add(new Node(startTime,endTime));

        return true;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(startTime,endTime);
 */