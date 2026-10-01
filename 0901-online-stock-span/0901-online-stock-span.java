 
class StockSpanner {
private class Node{
        int val;
        int lesscount;
        Node(int v,int l){
            this.val = v;
            this.lesscount = l;
        }
    }


    Stack<Node> st;

    public StockSpanner() {
       st = new Stack<>();
    }
    
    public int next(int price) {

        int length =1;

        while(!st.isEmpty() &&   st.peek().val<=price){

                length+=st.pop().lesscount;
        }

        st.push(new Node(price,length));

        return length;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */