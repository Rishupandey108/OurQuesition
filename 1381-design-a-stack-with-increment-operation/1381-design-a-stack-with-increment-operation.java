/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */
class CustomStack {
        int size;
        int arr[];
        int len =-1;
    public CustomStack(int maxSize) {
        this.size = maxSize;
        arr = new int[maxSize];
    }
    
    public void push(int x) {
        if(len==size-1){
            return;
        }

        arr[++len] = x;
    }
    
    public int pop() {
        if(len==-1){
            return -1;
        }
        int val = arr[len];
        --len;
        return val;
    }
    
    public void increment(int k, int val) {
        int sz= Math.min(k,size);

        for(int i=0;i<sz;i++){
            arr[i]+=val;
        }
    }
}

